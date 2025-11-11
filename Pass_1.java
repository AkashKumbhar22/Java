/* --------------- Pass 1 Assembler --------------- */

import java.io.*;
import java.util.*;

class MnemonicTable {
    public String mnemonic;
    public String opcode;
    public int num;

    public MnemonicTable(String mnemonic, String opcode, int num) {
        this.mnemonic = mnemonic;
        this.opcode = opcode;
        this.num = num;
    }
}

public class Pass_1 {

    Map<String, MnemonicTable> is = new Hashtable<String, MnemonicTable>();
    ArrayList<String> symtab = new ArrayList<>();
    ArrayList<Integer> symaddr = new ArrayList<>();
    ArrayList<String> littab = new ArrayList<>();
    ArrayList<Integer> litaddr = new ArrayList<>();
    ArrayList<Integer> pooltab = new ArrayList<>();
    int LC = 0; // Location Counter

    // Step 1: Create Instruction Set Table
    public void createIS() throws Exception {
        MnemonicTable m1 = new MnemonicTable("STOP", "00", 0);
        is.put("STOP", m1);
        MnemonicTable m2 = new MnemonicTable("ADD", "01", 0);
        is.put("ADD", m2);
        MnemonicTable m3 = new MnemonicTable("SUB", "02", 0);
        is.put("SUB", m3);
        MnemonicTable m4 = new MnemonicTable("MULT", "03", 0);
        is.put("MULT", m4);
        MnemonicTable m5 = new MnemonicTable("MOVER", "04", 0);
        is.put("MOVER", m5);
        MnemonicTable m6 = new MnemonicTable("MOVEM", "05", 0);
        is.put("MOVEM", m6);
        MnemonicTable m7 = new MnemonicTable("COMP", "06", 0);
        is.put("COMP", m7);
        MnemonicTable m8 = new MnemonicTable("BC", "07", 0);
        is.put("BC", m8);
        MnemonicTable m9 = new MnemonicTable("DIV", "08", 0);
        is.put("DIV", m9);
        MnemonicTable m10 = new MnemonicTable("READ", "09", 0);
        is.put("READ", m10);
        MnemonicTable m11 = new MnemonicTable("PRINT", "10", 0);
        is.put("PRINT", m11);
    }

    // Step 2: Generate Intermediate Code, Symbol Table, Literal Table & Pool Table
    public void generateIC() throws Exception {
        BufferedWriter wr = new BufferedWriter(new FileWriter("ic.txt"));
        BufferedReader br = new BufferedReader(new FileReader("input.asm"));
        String line = " ";
        pooltab.add(0, 0);
        wr.write("---------------------\n  Intermediate Code\n---------------------\n");

        while ((line = br.readLine()) != null) {

            String[] split = line.split("\\s+");
            if (split[0].length() > 0) {
                // Label Found
                if (!symtab.contains(split[0])) {
                    symtab.add(split[0]);
                    symaddr.add(LC);
                } else {
                    int index = symtab.indexOf(split[0]);
                    symaddr.set(index, LC);
                }
            }

            // Handle assembler directives
            if (split[1].equals("START")) {
                LC = Integer.parseInt(split[2]);
                wr.write("(AD,01)(C," + split[2] + ")\n");

            } else if (split[1].equals("ORIGIN")) {
                LC = getAddress(split[2]);

            } else if (split[1].equals("EQU")) {
                int addr = getAddress(split[2]);
                if (!symtab.contains(split[0])) {
                    symtab.add(split[0]);
                    symaddr.add(addr);
                } else {
                    int index = symtab.indexOf(split[0]);
                    symaddr.set(index, addr);
                }

            } else if (split[1].equals("LTORG") || split[1].equals("END")) {
                for (int i = pooltab.get(pooltab.size() - 1); i < littab.size(); i++) {
                    if (litaddr.get(i) == 0) {
                        litaddr.set(i, LC);
                        LC++;
                    }
                }
                if (split[1].equals("LTORG"))
                    pooltab.add(littab.size());
                wr.write(split[1].equals("LTORG") ? "(AD,05)\n" : "(AD,04)\n");

            } else if (split[1].equals("DS")) {
                LC += Integer.parseInt(split[2]);
                wr.write("(DL,01)(C," + split[2] + ")\n");

            } else if (split[1].equals("DC")) {
                LC++;
                wr.write("(DL,02)(C," + split[2].replace("'", "") + ")\n");

            } else if (is.containsKey(split[1])) {
                wr.write("(IS," + is.get(split[1]).opcode + ") ");
                handleOperands(split, wr);
                LC++;
            }
        }

        wr.flush();
        wr.close();
        br.close();

        // Print and Write Tables
        writeTable("sym.txt", "Symbol Table", "Symbol", "Address", symtab, symaddr);
        writeTable("lit.txt", "Literal Table", "Literal", "Address", littab, litaddr);
        writePoolTable("pool.txt");
    }

    // Operand handler
    private void handleOperands(String[] split, BufferedWriter wr) throws Exception {
        if (split.length > 2 && split[2] != null) {
            String reg = split[2].replace(",", "");
            if (reg.equals("AREG")) wr.write("(1) ");
            else if (reg.equals("BREG")) wr.write("(2) ");
            else if (reg.equals("CREG")) wr.write("(3) ");
            else if (reg.equals("DREG")) wr.write("(4) ");
            else addSymbol(reg, wr);
        }

        if (split.length > 3 && split[3] != null) {
            if (split[3].contains("=")) addLiteral(split[3], wr);
            else addSymbol(split[3], wr);
        }
    }

    // Add symbol
    private void addSymbol(String reg, BufferedWriter wr) throws Exception {
        if (!symtab.contains(reg)) {
            symtab.add(reg);
            symaddr.add(0);
        }
        wr.write("(S," + symtab.indexOf(reg) + ")\n");
    }

    // Add literal
    private void addLiteral(String val, BufferedWriter wr) throws Exception {
        String norm = val.replace("=", "").replace("'", "");
        if (!littab.contains(norm)) {
            littab.add(norm);
            litaddr.add(0);
        }
        wr.write("(L," + littab.indexOf(norm) + ")\n");
    }

    // Address calculation for ORIGIN/EQU
    private int getAddress(String str) {
        if (str.contains("+") || str.contains("-")) {
            String[] sp = str.split("\\+|\\-");
            int baseAddr = symaddr.get(symtab.indexOf(sp[0]));
            int offset = Integer.parseInt(sp[1]);
            return str.contains("+") ? baseAddr + offset : baseAddr - offset;
        } else {
            return symaddr.get(symtab.indexOf(str));
        }
    }

    // Write table helper
    private void writeTable(String filename, String title, String col1, String col2,
                            ArrayList<String> names, ArrayList<Integer> values) throws Exception {
        BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
        wr.write("-------------------\n    " + title + "\n-------------------\n" + col1 + "    " + col2 + "\n");
        for (int i = 0; i < names.size(); i++) {
            wr.write(" " + names.get(i) + "        " + values.get(i) + "\n");
        }
        wr.flush();
        wr.close();
    }

    // Pool table writer
    private void writePoolTable(String filename) throws Exception {
        BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
        wr.write("-----------------------------\n         Pool Table\n-----------------------------\nPool Index    Literal Index\n");
        for (int i = 0; i < pooltab.size(); i++) {
            wr.write(" " + i + "              " + pooltab.get(i) + "\n");
        }
        wr.flush();
        wr.close();
    }

    public static void main(String[] args) throws Exception {
        Pass_1 p = new Pass_1();
        p.createIS();
        p.generateIC();
    }
}

/*
---------------- Sample input.asm ----------------

  START    100
A    DS    3
L1   MOVEM  AREG,  B
     ADD    AREG,  C
     MOVER  AREG,  ='12'
D    EQU    A+1
     LTORG
L2   PRINT  D
     ORIGIN A-1
     MOVER  AREG,  ='5'
C    DC     '5'
     ORIGIN L2+1
     STOP
B    DC     '19'
     END
--------------------------------------------------
*/
