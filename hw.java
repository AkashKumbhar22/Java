/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16  */

/* Logic /Algorithm
1)Take the input N
2)Lets consider it is a third digit number
3)Solve it by modulus by 10 in a
4)Divide by 10 in b(Now we get a 2 digit number)
5)Now give modulus of b by 10 in c
6)Divide by 10 in d
7)Add a ,c,d
 

import java.util.Scanner;

public class hw{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer N(0 to 1000): ");
        int N = sc.nextInt();

        if(N>9 && N<1000){
            int a = N%10;
            int b = N/10;
            int c = b%10;
            int d = b/10;

           int sum = a+c+d;
            System.out.println("The sum is: " + sum);
        }

        else if (N>9 && N<100){
            int e = N%10;
           int f = N/10;

            int add = e+f;
            System.out.println("The sum is: "+add);
        }
    }
}  */



/* 
Write a Java program to convert minutes into years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days */

/* 
import java.util.Scanner;
public class hw {
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Input the number of minutes: ");
    int min = sc.nextInt();
    
    int year = min/525600;
    System.out.println(min + " minutes is approxiamtely "+ year + " years");
          }
}   */

//Write a Java program to compute the body mass index (BMI).
/* 
import java.util.Scanner;
public class hw {
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the weight(in kg): ");
    float weight = sc.nextFloat();
    
    System.out.println("Enter the height(in m");
    float height = sc.nextFloat();

    float BMI = weight/(height * height);
    System.out.println("Teh BMI is: "+BMI);
    }
}  */

/*Write a Java program to take the user for a distance (in meters) and
 the time taken (as three numbers: hours, minutes, seconds), and
  display the speed, in meters per second, kilometers per hour and
   miles per hour (hint: 1 mile = 1609 meters)
 */

import java.util.Scanner;
import java.time.LocalTime;

public class hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distane(in meters): ");
        int distance = sc.nextInt();

        System.out.println("Display the time taken (as three numbers: hours, minutes, seconds): ");
        String userinput = scanner.nextLine();

    }
}