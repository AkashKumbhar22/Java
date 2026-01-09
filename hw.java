package Homework;
/* . Simple if Statement and Scanner
Question: Write a Java program that prompts the user to enter their age using the Scanner class. If the entered age is 18 or greater, the program should print the message: "You are eligible to vote."
2. if-else Statement
Question: Modify the previous program. After getting the user's age, use an if-else statement to determine if they are an adult.
If the age is 18 or greater, print: "You are an adult."
Otherwise, print: "You are a minor."
 
 
import java.util.Scanner;

public class hw {
    public static void main(String[]args){

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter your age: ");
         int age = sc.nextInt();

         if(age>18){
            System.out.println("Eligible to vote");
         }
         else if(age>110 || age<=0){
            System.out.println("Inavlaid age");
         }
         else{
            System.out.println("Not eligible to vote");
         }
    }
}   


3. else-if Ladder (Multiple Conditions)
Question: Create a Java program that takes a student's numerical score (0-100) as input using the Scanner class. Use an else-if ladder to assign a letter grade based on the following criteria:

Score Range
Grade
90 - 100
A
80 - 89
B
70 - 79
C
60 - 69
D
0 - 59
F
 

import java.util.Scanner;
public class hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerical score (0-100)");
        int a = sc.nextInt();

        if(a>=90 || a==100){
            System.out.println("Garde is A");
        }
        else if(a>=80 && a<90){
            System.out.println("Grade is B");
        }
        else if(a>=70 && a<80){
            System.out.println("Grade is C");
        }
        else if(a>=60 && a<70){
            System.out.println("Grade is D");
        }
        else if(a>=0 && a<60){
            System.out.println("Grade is F");
        }
    }
}
    */

/* 
4. switch Statement
Question: Write a program that takes an integer input from 1 to 7 using Scanner, representing a day of the week (1 for Sunday, 2 for Monday, ..., 7 for Saturday). Use a switch statement to print the corresponding day's name.
If the user enters a number outside this range (1-7), the default case should print: "Invalid day number." */

/* 
import java.util.Scanner;

public class hw{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

 System.out.println("Enter the day num(1-7): ");
    int Day_num = sc.nextInt();

    switch(Day_num){
        case 1:
            System.out.println("Its Monday");
            break;

        case 2:
            System.out.println("Its Tuesday");
            break;

        case 3:
            System.out.println("Its Wednesday");
            break;

        case 4:
            System.out.println("Its Thursday");
            break;
        
        case 5:
            System.out.println("Its Friday");
            break;
        
        case 6:
            System.out.println("Its Saturday");
            break;

        case 7:
            System.out.println("Its Hoilday");
            break;
        
        default:
            System.out.println("Invalid");
            break;
    }
}
}  */

/*5. Ternary Operator
Question: Write a Java snippet that declares an integer variable temperature and sets it to 25. Use the ternary operator to check if the temperature is greater than 30.
If it is greater than 30, store the string "Hot" in a variable called weatherStatus.
Otherwise, store the string "Moderate" in weatherStatus.
Finally, print the value of weatherStatus. (No Scanner needed for this one, just the conditional logic).
 */
/*
public class hw{
    public static void main(String[]args){
        
        int temperature = 25;

        String weatherStatus = (temperature>30) ? "Hot" : "Moderate";

        System.out.println(weatherStatus);

    }
} */

/* 6. Combined Challenge (Scanner, if-else, and switch)
Question: Write a complete Java program that asks the user to enter a month number (1-12).
First, use an if-else statement to check if the input is valid (between 1 and 12). If it's invalid, print "Invalid Month Number" and exit.
If the input is valid, use a switch statement to print the number of days in that month. Assume the year is not a leap year.

Month Numbers                Days
1, 3, 5, 7, 8, 10, 12         31
4, 6, 9, 11                   30
2                             28
*/
import java.util.Scanner;
public class hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month number (1-12).");
        int month = sc.nextInt();
        if(month>1 && month <=12){
                switch(month){
                    case 1:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Nmber of days in that month:28");
                            break;
                        }
                    case 3:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 4:
                        {
                            System.out.println("Nmber of days in that month:30");
                            break;
                        }
                    case 5:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 6:
                        {
                            System.out.println("Nmber of days in that month:30");
                            break;
                        }
                    case 7:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 8:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 9:
                        {
                            System.out.println("Nmber of days in that month:30");
                            break;
                        }
                    case 10:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    case 11:
                        {
                            System.out.println("Nmber of days in that month:30");
                            break;
                        }
                    case 12:
                        {
                            System.out.println("Nmber of days in that month:31");
                            break;
                        }
                    default:{
                            System.out.println("Not available month");
                            break;
                    }
                }
                       }
                else{
                    System.out.println("Number is invalid");
                }
    }
}

