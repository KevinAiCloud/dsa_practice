package iamNeo;

/* Single File Programming Question
Problem Statement



There are N cities, and some roads connect pairs of cities. Each road has a repair cost associated with it. All roads are currently damaged, and the goal is to repair some of them so that all cities become connected again.



The cost to repair each road is given in the form of an adjacency matrix, where the value at position (i, j) represents the cost to repair the road between city i and city j. A value of 0 indicates that there is no direct road between those two cities.



Your task is to determine the minimum total cost required to repair roads so that all cities become connected.



This problem can be solved using the Minimum Spanning Tree (MST) concept.

Input format :
First line: An integer N — the number of cities.



Next N lines: Each line contains N integers separated by spaces, representing the adjacency matrix of road repair costs.



matrix[i][j] = cost to repair the road between city i and city j.



0 indicates no direct road.



The adjacency matrix is symmetric because the graph is undirected.

Output format :
A single integer: the minimum total cost to repair roads so all cities are connected.



No extra text.



Refer to the sample output for formatting.

Code constraints :
1 ≤ N ≤ 100

1 ≤ cost ≤ 1000

0 indicates no direct road

Adjacency matrix is symmetric

Graph is connected

Sample test cases :
Input 1 :
5
0 1 2 3 4
1 0 5 0 7
2 5 0 6 0
3 0 6 0 0
4 7 0 0 0
Output 1 :
10
Input 2 :
4
0 2 0 6
2 0 3 8
0 3 0 0
6 8 0 0
Output 2 :
11 */


import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int cost[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cost[i][j]=sc.nextInt();
            }
        }
        
        boolean visited[]=new boolean[n];
        visited[0]=true;
        
        int totalCost=0;
        
        for(int k=0;k<n-1;k++){
            int min=Integer.MAX_VALUE;
            int x=0,y=0;
            
            for(int i=0;i<n;i++){
                if(visited[i]){
                    for(int j=0;j<n;j++){
                        if(!visited[j] && cost[i][j]!=0){
                            if(cost[i][j]<min){
                                min=cost[i][j];
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
            }
            
            totalCost+=min;
            visited[y]=true;
            
        }
        System.out.println(totalCost);
    }
}