package iamNeo;

/* Single File Programming Question
Problem Statement



Arjun, a delivery route analyst, is designing a routing system where each location must be visited exactly once without revisiting any. The city map is modeled as a directed graph, and each valid delivery route corresponds to a Hamiltonian path—a path that visits every node exactly once.



The Hamiltonian Path Problem is a well-known NP-Complete problem. Arjun wants to find out how many such valid Hamiltonian paths exist in the given graph. Help him compute the total number of these valid delivery routes.



Example:

Input: N = 4, K = 6, graph[][] = {{1, 0}, {2, 0}, {2, 1}, {1, 2}, {3, 1}, {3, 2}}

Output: 2

Explanation:

The paths below are shown as 1 -> 3 -> 2 -> 4, and 1 -> 2 -> 3 -> 4 which start at 1 and end at 4 and are called Hamiltonian paths.

Input format :
The first line contains two integers n and m, representing the number of vertices (locations) and the number of directed edges (routes).

Each of the next m lines contains two integers u and v, representing a directed edge from node u to node v.

Output format :
The output prints a single integer representing the total number of Hamiltonian paths in the graph.



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the given test cases will fall under the following constraints:

1 ≤ N ≤ 6

0 ≤ M ≤ N(N−1)

0 ≤ u,v < N

Sample test cases :
Input 1 :
4 
6
1 0
2 0
2 1
1 2
3 1
3 2
Output 1 :
2
Input 2 :
2 
1
0 1
Output 2 :
1
Input 3 :
3 
2
0 1
1 1
Output 3 :
0
Input 4 :
2 
1
1 2
Output 4 :
0 
*/


import java.util.*;

class Main{
    static int count=0;
    
    public static void dfs(int node, int depth, int v, boolean arr[][], boolean visited[] ){
        visited[node]=true;
        if(depth==v){
            count++;
            visited[node]=false;
            return;
        }
        for(int i=0;i<v;i++){
            if(arr[node][i] && !visited[i]){
                dfs(i,depth+1,v,arr,visited);
            }
        }
        visited[node]=false;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        boolean arr[][]=new boolean[v][v];
        
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int w=sc.nextInt();
            
            if(u>=0 && u<v && w>=0 && w<v){
                arr[u][w]=true;
            }
        }
        
        for(int i=0;i<v;i++){
            boolean visited[]=new boolean[v];
            dfs(i,1,v,arr,visited);
        }
        
        System.out.println(count);
    }
}  