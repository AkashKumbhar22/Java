// Pass_2.java
import java.io.*;
import java.util.*;

class TableRow {
    String symbol;
    int address;
    int index;

    public TableRow(String symbol, int address, int index) {
        this.symbol = symbol;
        this.address = address;
        this.index = index;
    }
}

public class Pass_2 {
    ArrayList<TableRow> SYMTAB = new ArrayList<>();
    ArrayList<TableRow> LITTAB = new ArrayList<>();

    public static void main(String[] args) {
        Pass_2 pass2 = new Pass_2();
        try {
            pass2.generateCode("ic.txt"); // 👈 lowercase filename
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readTables() throws Exception {
        
        BufferedReader br = new BufferedReader(new FileReader("sym.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");
            SYMTAB.add(new TableRow(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[0])));
        }
        br.close();

        br = new BufferedReader(new FileReader("lit.txt"));
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");
            LITTAB.add(new TableRow(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[0])));
        }
        br.close();
    }

    public void generateCode(String filename) throws Exception {
        readTables();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter("pass2.txt")); 

        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");

            if (parts[0].contains("AD") || parts[0].contains("DL,02")) {
                bw.write("\n");
                continue;
            } else if (parts.length == 2 && parts[0].contains("DL,01")) {
                int constant = Integer.parseInt(parts[1].replaceAll("[^0-9]", ""));
                code = "00\t0\t" + String.format("%03d", constant) + "\n";
                bw.write(code);
            } else if (parts[0].contains("IS")) {
                int opcode = Integer.parseInt(parts[0].replaceAll("[^0-9]", ""));
                int reg = (parts.length > 1 && parts[1].matches("\\d")) ? Integer.parseInt(parts[1]) : 0;
                int mem = 0;

                if (parts.length == 3) {
                    if (parts[2].contains("S")) {
                        int symIndex = Integer.parseInt(parts[2].replaceAll("[^0-9]", ""));
                        mem = SYMTAB.get(symIndex - 1).address;
                    } else if (parts[2].contains("L")) {
                        int litIndex = Integer.parseInt(parts[2].replaceAll("[^0-9]", ""));
                        mem = LITTAB.get(litIndex - 1).address;
                    }
                }

                code = String.format("%02d\t%d\t%03d\n", opcode, reg, mem);
                bw.write(code);
            }
        }

        bw.close();
        br.close();
        System.out.println(" Pass 2 completed successfully! File generated: pass2.txt");
    }
}
