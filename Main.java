/*public class Main{
    public static void main(String[] args) {
        System.out.println("Hello Akash");
        System.out.println("you are learning chatgpt ");
        
        }
    } */

//2Write a program that prints your name, your favorite language, and one line saying “I will master DSA in Java soon.”

/* 
public class Main{
    public static void main(String[] args){
        String name = "Aakash";
        int sem = 5;
        double cgpa = 9.1;
        boolean program = true;

        System.out.println("Your name :" + name);
        System.out.println("Your current semester " + sem);
        System.out.println("Your CGPA (decimal number)" + cgpa);
        System.out.println("Whether you love programming :" + program);

    }
} */

import java.util.Scanner; // import library

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // read string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // read integer input

        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
