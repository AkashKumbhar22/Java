/*Session 3
Objectives : 1)How to take inputs
2)Dcision making statements i)if ii)else if /ladder iii)switch case
3) Loops i) for ii)while iii)do while


import java.util.Scanner;

public class input {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
    
     /*    System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("The first number is " + a);

          
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("The second number is " + b);

        int sum = a+b;
        System.out.println("The sum of first and second number is : " + sum);
    
        System.out.print("Enter percentage: ");
        float percentage = sc.nextFloat();
        System.out.println(percentage);   

        System.out.print("enter your spga: ");
        double sgpa = sc.nextDouble();
        System.out.println("Your spga is: " + sgpa);

        System.out.print("Enter your phone no.: " );
        long  phone = sc.nextLong();
        System.out.println("Your phone_no. is" + phone); */
/* 
        //To take single word as input 
        System.out.print("Enter your first name: ");
        String name = sc.next();
        System.out.println(name);

        System.out.print("Enter your phone no.: " );
        long  phone = sc.nextLong();
        System.out.println("Your phone_no. is" + phone); 


        //To print multiple lines add nextLine()
        System.out.println("Enter full name: ");
        String surname = sc.nextLine();
        System.out.println("Your full name is:" + surname);

    }
}
*/
import java.util.Scanner;
public class input{
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