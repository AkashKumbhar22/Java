import java.util.Scanner;

public class decision {
    public static void main(String[]args){

         Scanner sc = new Scanner(System.in);

        /*  System.out.print("Enter your age: ");
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


         //Take the two input from user and find the largest

        System.out.print("Enter the first input: ");
        int a = sc.nextInt();

        System.out.println("Enter the second input:");
        int b = sc.nextInt();
        
        if(a>b){
            System.out.println("First input is greater than second");
        }
        else if(a==b){
            System.out.println("Both the inputs are equal");
        }
        else if(a<b){
            System.out.println("The second input is greater than first input");
        }
        else{
            System.out.println("invalid input");
        }
            


                //Ternary Operator
        System.out.print("Enter num1: ");
        int num1= sc.nextInt();

        System.out.println("Enter num2: ");
        int num2= sc.nextInt();

        System.out.println(num1>num2?"Num1 is greater than num2 " : "Num2 is greater than num1"); 

    
        //Switchcase 
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
*/

        System.out.print("Enter the first input: ");
        int a = sc.nextInt();

        System.out.println("Enter the second input:");
        int b = sc.nextInt();

        System.out.println("Enter the third input:");
        int c = sc.nextInt();


        
        if(a>=b && a>=c){
            System.out.println("First input is greater than second");
        }
        else if(a<=c && b<=c){
            System.out.println("Third input is greater than of all");
        }
        else if(a<=b && b>=c){
            System.out.println("The second input is greater than first input");
        }
      //  else{
      //      System.out.println("invalid input");
  //  }
}
}
