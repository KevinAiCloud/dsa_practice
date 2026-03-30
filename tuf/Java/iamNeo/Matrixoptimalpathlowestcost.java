package iamNeo;

/* Single File Programming Question
Problem Statement



Leena is navigating a warehouse represented as a 2D grid where each cell holds a non-negative number indicating the cost to pass through it. Starting from the top-left corner, she must reach the bottom-right corner by moving only right or down. 



Write a program to ensure that Leena takes a path that minimizes the total cost accumulated along the way.



Example 1:

﻿

Input: grid = [[1,3,1],[1,5,1],[4,2,1]]

Output: 7

Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.



Example 2:

Input: grid = [[1,2,3],[4,5,6]]

Output: 12

Input format :
The first line contains wo space-separated integers m and n, denoting the number of rows and columns.

Next m lines Each line contains n space-separated non-negative integers representing the cost in the grid cells.

Output format :
The output prints a single integer representing the minimum path sum from the top-left to bottom-right of the grid.



Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ m, n ≤ 10

0 ≤ grid[i] [j] ≤ 15

Sample test cases :
Input 1 :
3 3
1 3 1
1 5 1
4 2 1
Output 1 :
7
Input 2 :
2 3
1 2 3
4 5 6
Output 2 :
12 */


// You are using Java
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int arr[][]=new int[r][c];
        
        for(int i=0 ; i<r ; i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int finall[][]=new int[r][c];
        finall[0][0]=arr[0][0];
        
        for(int i=1;i<r;i++){
            finall[i][0] = arr[i][0] + finall[i-1][0];
        }
        
        for(int j=1;j<c;j++){
            finall[0][j]=arr[0][j]+finall[0][j-1];
            
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                finall[i][j]=Math.min(finall[i][j-1],finall[i-1][j]) + arr[i][j];
            }
        }
        System.out.println(finall[r-1][c-1]);
    }
}