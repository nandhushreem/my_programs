/*takeing input until user enters 10

import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        while(1>0){
            int n=sc.nextInt();
            if(n==10){
                break;
            }
        }
    }
}
*/
//-------------------------------------------------------------------------------------------
/* taking input until user enters a multiple of 10 
import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n!=0 && n%10==0){
                break;
            }
            System.out.println(n);
        }
    }
}
    */
//-------------------------------------------------------------------------------------------
/*declaration of array 
import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){   
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   

    }
}
    */

//----------------------------------------------------------------------------------------
/*taking input of float array and print it

import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
    */

//--------------------------------------------------------------------------------------------

/*sum of array elements
import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);
    }
}   
    */
//--------------------------------------------------------------------------------------------
/*2D Array input and output

import java.util.Scanner;
public class JumpingLoop {  
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    */
//--------------------------------------------------------------------------------------------
/*max and min in array
import java.util.Scanner;
public class JumpingLoop {  
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max element is: "+max);
        System.out.println("Min element is: "+min);
    }
}
    */
//--------------------------------------------------------------------------------------------
/*for each loop

import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args){
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i:arr){
            System.out.println(i);
        }
    }
}
*/
//--------------------------------------------------------------------------------------------
/*2D array

import java.util.Scanner;
public class JumpingLoop {  
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter number of columns:");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array elements are:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
//-------------------------------------------------------------------------------------------
/*nested forloop for 2D array
import java.util.Scanner;
public class JumpingLoop{
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter number of columns:");
        int n=sc.nextInt(); //digital and cyber froud detection system
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array elements are:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
*/
//digital and cyber froud detection system
/*
1) write a java program to read n*m elements from the usre and compute the sum of rows.
2) write a java program to read n*m elements from the usre and compute the sum of columns.
3) write a java program to read two matrices of n*m and n*j and perform matrix multiplication and print the result.

*/

/*compond interest
import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double p=sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double r=sc.nextDouble();
        System.out.println("Enter time in years:");
        int t=sc.nextInt();
        double ci=p*Math.pow(1+r/100,t)-p;
        System.out.println("Compound interest is: "+ci);
    }
}
*/
//Given number of days (D). Convert that days(D) into years, weeks.
//Note: Ignore Odd days.
//swap of two numbers without using third variable
import java.util.Scanner;
public class JumpingLoop {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=a+b;
        b=a1-b;
        a1=a1-b;
        System.out.println("After swapping: a="+a1+" b="+b);
    }
}
