package iamNeo;

/* Single File Programming Question
Problem Statement



You are given two 2x2 matrices, A and B. Your task is to multiply these matrices using Strassen's Matrix Multiplication, which is a divide-and-conquer technique that efficiently computes the product of two matrices.



Write a program to perform matrix multiplication using the Strassen's Multiplication and output the resulting matrix.

Input format :
The input consists of two 2x2 matrices, A and B, where each matrix element is an integer (mn values).

Output format :
The output displays the resulting 2x2 matrix after performing matrix multiplication using Strassen Multiplication.

Code constraints :
1 <= mn <= 100

Sample test cases :
Input 1 :
1 2
3 4
5 6
7 8
Output 1 :
19 22 
43 50 
Input 2 :
2 4
6 8
1 3
5 7
Output 2 :
22 34 
46 74  */


// You are using Java
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();
        
        int M1=(a+d)*(e+h);
        int M2=(c+d)*(e);
        int M3=(a)*(f-h);
        int M4=(d)*(g-e);
        int M5=(a+b)*(h);
        int M6=(c-a)*(e+f);
        int M7=(b-d)*(g+h);
        
        int C11=M1+M4-M5+M7;
        int C12=M3+M5;
        int C21=M2+M4;
        int C22=M1-M2+M3+M6;
        
        System.out.println(C11+" "+C12);
        System.out.println(C21+" "+C22);
    }
}