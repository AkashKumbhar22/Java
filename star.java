//package Session7;
/* 
import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
            for(int r=1;r<=n;r++){
                for(int c=1;c<=n;c++){
                    if(r==1 || r==n || c==1 || c==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }System.out.println();        
    }
            }
           
        } */

//Question 2 :-pyramid  
 /*
import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
            for(int r=1;r<=n;r++){
                for(int spaces=1;spaces<=n-r;spaces++){
                            System.out.print(" ");}
                        for(int star=1;star<=r;star++){
                           // System.out.print(" ");
                            System.out.print("* ");
                        }
                         System.out.println();     
    }//System.out.println();
            }
           
        } */
/* 
            import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
      //  int count =0;
            for(int r=1;r<=n;r++){
                for(int spaces=1;spaces<=n-r;spaces++){
                            System.out.print(" ");}
                        for(int star=1;star<=r;star++){
                           // System.out.print("* ");
                          // count++;
                            System.out.print(r+ " ");
                        }
                         System.out.println();     
    }
            }         
        }
*/

/*import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
      //  int count =0;
            for(int r=1;r<=n;r++){
                     for(int i=1;i<=r;i++){
                            System.out.print("* ");
                     }
                     System.out.println();
    }
            }         
        } */


/*Output
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

/*import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
            for(int r=1;r<=n;r++){
                   for(int numbers=1;numbers<=n-r+1;numbers++){
                    System.out.print(numbers+" ");
                   }System.out.println("");
    }
            }         
        } */


    /* 
1
2 3
4 5 6
7 8 9 10
 */
/*import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count =1;
            for(int r=1;r<=n;r++){
                for(int i=1;i<=r;i++){
                System.out.print(count+" ");
                count++;}
                System.out.println();
                   } 
               }
            }     */  
        
               
/*print
1              1= r1+c1=even
0 1            0 =r2+c1=odd ; 1=r2+c2=even
1 0 1 
0 1 0 1
1 0 1 0 1
 */

/*
import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
     //    int z = column+row;
            for(int row=1;row<=n;row++){
                for(int column=1;column<=row;column++){
               // System.out.print(i+" ");
               int z = column+row;
                if((z)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                }
                System.out.println();
                   } 
               }
            }    
 */
 
/* Print
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
*/ /* 
//Increasing triangle pattern in java
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for(int r=1;r<=n;r++){
                for(int spaces=1;spaces<=n-r;spaces++){ //spaces=n-r
                    System.out.print("  ");
                }
                for(int c=r;c>=1;c--){
                    System.out.print(c + " ");}
                for(int z=2;z<=r;z++){
                    System.out.print(z + " ");
                }
             //   for(int )
                System.out.println();
            }
        }
    } */
/* 
//Decreasing triangle pattern
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int r=1;r<=n;r++){
            for(int column=1;column<=n;column++){
            System.out.print("*");}
             System.out.println();
        }    
    }
} */
/*//Right side triangle pattern
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int r=1;r<=n;r++){
            for(int column=r;column<=n;column++){
            System.out.print("*");}
             System.out.println();
        }    
    }
}    */
/*
//Right sided decreasing triangle pattern in java
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++)
            {
                for(int spaces=1;spaces<=r-1;spaces++)
                {
                    System.out.print("  ");
                }
            for(int column=r;column<=n;column++)
                {
            System.out.print(" *");
        }

             System.out.println();
        }    
    }
}   */

// Hill pattern in java
/* 
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++)
            {
                for(int spaces=r;spaces<=n;spaces++)
                {
                    System.out.print("  ");
                }
            for(int column=1;column<=r;column++)
                {
            System.out.print(" " + column);
        }
            for(int i=1;i<=r-1;i++){
                System.out.print( " " + i );
            }

             System.out.println();
        }    
    }
} */

    //reverse  Hill pattern in java
/*
import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++)
            {
                 for(int spaces=1;spaces<=r-1;spaces++)
                {
                    System.out.print("  ");
                }
            for(int column=r;column<=n;column++)
                {
            System.out.print(" " + column) ;
        }
            for(int i=1;i<=n-r;i++){
                System.out.print( " " + i );
            }

             System.out.println();

        }    
    }
}*/

import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int r=1;r<=n;r++)
            {
                for(int spaces=r;spaces<=n;spaces++)
                {
                    System.out.print(" ");
                }
            for(int column=1;column<=r;column++)
                {
            System.out.print(" *");
        }
            for(int i=1;i<=r-1;i++){
                System.out.print( " *");
            }

             System.out.println();
        }    
          for(int m=1;m<=n;m++)
            {
                 for(int s=1;s<=m-1;s++)
                {
                    System.out.print(" ");
                }
            for(int c=m;c<=n;c++)
                {
            System.out.print(" *") ;
        }
            for(int j=1;j<=n-m;j++){
                System.out.print( "  *");
            }

             System.out.println();

        }    
    }
}
 