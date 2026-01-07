/*Write a Java program that declare two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
Test Data
Input 1st integer: 25
Input 2nd integer: 5 

Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20   */
//Max integer: 25
//Min integer: 5

/*
import java.util.Scanner;

public class Clac{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first input: ");
        int a  = sc.nextInt();

        System.out.print("Enter the second input: ");
        int b  = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of two integers: "+ sum);

        int difference = a-b;
        System.out.println("Difference of two integers: "+difference);

        float average = (a+b)/2;
        System.out.println("Average of two integers: "+average);

        int distance = a-b ;
        System.out.println("Distance of two integers: "+distance);

    }
}
*/



/*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */

/* 
import java.util.Scanner;
public class Clac{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in fahreneheit: ");
        float Fahrenheit = sc.nextFloat();

        float Clesius = (Fahrenheit - 32)/1.8f;
        
        System.out.println(Fahrenheit+" degree Fahrenheit is equal to "+Clesius+" in Celsius");
    }
}*/

/*Write a Java program that reads a number in inches and converts it to meters.

Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */


import java.util.Scanner;
public class Clac{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        float inch = sc.nextFloat();

        float meters = inch * 0.0254f;

        System.out.println(inch + " inch is " + meters);
    }
}  
