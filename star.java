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
    
}// 50. Second Largest: Find the second largest number in an array without sorting it.

import java.util.Scanner;

public class pract{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);



int arr[]={1,2,3,4,5,6};

int largest = Integer.MIN_VALUE;

int sec_large = Integer.MIN_VALUE;



for(int i=0;i<arr.length;i++){

    if(arr[i]>largest){

        largest = arr[i];

    }

    else if(arr[i]>sec_large && arr[i]<largest){

        sec_large = arr[i];

    }

}

System.out.println(sec_large);

}

}
