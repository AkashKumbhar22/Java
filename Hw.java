/*Write a for loop to calculate the factorial of a number n (e.g., 5! = 120). 
import java.util.Scanner;
public class Hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
        }
        System.out.println(fac);
    }
} */


/*Write a for loop to calculate and print the sum of all prime numbers between 2 and 100. 
public class Hw{
    public static void main(String[]args){
        int sum = 0;
        for(int i =2;i<=100;i++){
            if(i%2!=0){
                sum = sum+i;
                print
            }
        }
    }
}  */


/*Write a for loop to print all numbers between 1 and 200 that are perfect squares (1, 4, 9, 16, ...). 
public class Hw{
    public static void main(String[]args){
        for(int i =1;i<=200;i++){
            System.out.println(i*i);
        }

    }
}*/

/*Write a for loop to print the number of digits in an integer N (e.g., for 12345, the output is 5). */
import java.util.Scanner;
public class Hw{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int N =  sc.nextInt();
       int i;
       //int j;
       for(;i<=N;){
        //int j;
        int j = i%10;
       }
        System.out.println(j);
    }
}