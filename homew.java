package Homework;

/*
7. Nested if-else (Input Validation)
Question: Write a program that asks the user to input two integer numbers: num1 and num2. Use nested if statements to determine the relationship between them:
The outer if should check if num1 is equal to num2. If true, print: "The numbers are equal."
The else block should contain an inner if-else statement that checks:
If num1 is greater than num2, print: "Num1 is greater than Num2."
Otherwise (if num1 is less than num2), print: "Num2 is greater than Num1."
 */
/*
import java.util.Scanner;
public class homew {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("The numbers are equal.");
        }
        else{
            if(num1>num2){
                System.out.println("Num1 is greater than Num2.");
            }
            else{
                System.out.println("Num2 is greater than Num1.");
            }
        }
    }
}  */

/*8. Logical Operators (&& and ||)
Question: Create a Java program that simulates checking eligibility for a discounted theater ticket. 
The program should prompt the user for two pieces of information:
Their age (int).
If they are a student (String, either "yes" or "no").
Use a single if statement with logical operators (&& or ||) to determine eligibility. A person is eligible for the discount if:
They are under 18 OR
They are a student (regardless of age).
Print "Discount Eligible." or "Full Price." accordingly.
 */

/* 
import java.util.Scanner;
public class homew {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age: ");
        int age = sc.nextInt();

        System.out.println("Are u a student(Yes or No)");
        String is_student = sc.next();

        if(age<18 || is_student.equalsIgnoreCase("yes")){
                    System.out.println("Discount Eligible.");
        }
        else{
            System.out.println("Full Price.");
        }
    }
}       */

/*9. Combining Ternary Operator and Scanner
Question: Write a program that uses the Scanner class to accept an integer value representing a product's price. 
The product is on sale if its price is less than or equal to $50.00.
Use the ternary operator to create a single String output variable called saleMessage.
If the price is less than or equal to 50, saleMessage should be "On Sale!"
Otherwise, saleMessage should be "Regular Price."
Print the final saleMessage to the console.
*/
/* 
import java.util.Scanner;/
public class homew {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter price(in $): ");
        int price = sc.nextInt();

        if(price<=50){
            System.out.println("Product is on sale");
        }
        else{
            System.out.println("product is not on sale");
        }
        
        String saleMessage = price <= 50 ? "On Sale" : "Regular Price";
        System.out.println("saleMessage: "+saleMessage);
    }
} */

/*
10. switch Statement with char Data Type
Question: Write a Java program that prompts the user to enter a single character (char) 
that represents a direction: N, S, E, or W (case sensitive). Use a switch statement
 to print the corresponding full direction name.
'N': "North"
'S': "South"
'E': "East"
'W': "West"
If the user enters any other character, the default case should print: "Invalid Direction Code."
 */
import java.util.Scanner;
public class homew {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the direction name   'N': \"North\"\r\n" + //
                        "'S': \"South\"\r\n" + //
                        "'E': \"East\"\r\n" + //
                        "'W': \"West\"");

                        
        char direction =sc.next().charAt(0);

        switch(direction){
            case 'N':{
                //direction = "N";
                System.out.println("North");
                break;
            }
            case 'S':{
                System.out.println("South");
                break;
            }
            case 'E':{
                System.out.println("East");
                break;
            }
            case 'W':{
                System.out.println("West");
                break;
            }
            default:{
                System.out.println("Invalid Direction Code");
                break;
            }
        }

    }
}