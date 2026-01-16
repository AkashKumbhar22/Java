//package Session7;

import java.util.Scanner;
public class star {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
            for(int r=1;r<=n;r++){
                for(int c=1;c<=n;c++){
                    if(r==1 || r==n || c==1 || c==n){
                        System.out.println("*");
                    }
                    else{
                        System.out.println(" ");
                    }
                }
            }
           // System.out.println();        
    }
    
}
