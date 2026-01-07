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
7)Add a ,c,d */
 

import java.util.Scanner;

public class sum_of_digits{
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
}