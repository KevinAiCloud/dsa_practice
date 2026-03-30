package iamNeo;

/* Single File Programming Question
Problem Statement



Consider a rat placed at (0, 0) in a square matrix of order N*N. It has to reach the destination at (N – 1, N – 1). Find all possible paths that the rat can take to reach from the source to the destination. The directions in which the rat can move are ‘U'(up), ‘D'(down), ‘L’ (left), and ‘R’ (right). Value 0 at a cell in the matrix represents that it is blocked and the rat cannot move to it while value 1 at a cell in the matrix represents that the rat can travel through it. Return the list of paths in lexicographically increasing order.



Note: In a path, no cell can be visited more than once. If the source cell is 0, the rat cannot move to any other cell.



Example 1



Input:

N = 4

m[][] =

{{1, 0, 0, 0},

{1, 1, 0, 1},

{1, 1, 0, 0},

{0, 1, 1, 1}}

Output:

DDRDRR DRDDRR

Explanation:

The rat can reach the destination at (3, 3) from (0, 0) by two paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR.



Example 2



Input:

N = 2

m[][] = 

{{1, 0},

{1, 0}}

Output:

-1

Explanation:

No path exists and the destination cell is blocked.

Input format :
The first line of input contains an integer n, representing the size of the maze.

The next n lines each contain n space-separated integers, representing the maze.

Output format :
The output consists of

If at least one path is found, print all valid paths as space-separated strings.

If no path is found, prints -1.



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the given test cases will fall under the following constraints:

2 ≤ N ≤ 5

0 ≤ m[i][j] ≤ 1

The initial and final cell will always be 1.

Sample test cases :
Input 1 :
4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1 
Output 1 :
DDRDRR DRDDRR 
Input 2 :
2
1 0
1 0
Output 2 :
-1
Input 3 :
3
1 1 1
0 1 0
0 1 1
Output 3 :
RDDR  */


import java.util.*;

class Main{
    
    static void dfs(int matrix[][], ArrayList<String> paths, String currentPath, int r, int c, int n){
        
        if(r==n-1 && c==n-1){
            paths.add(currentPath);
            return;
        }
        
        int temp=matrix[r][c];
        matrix[r][c]=0;
        
        char moves[]={'D','U','R','L'};
        int dr[]={1,-1,0,0};
        int dc[]={0,0,1,-1};
        
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            
            if(nr>=0 && nc>=0 && nr<n && nc<n && matrix[nr][nc]==1){
                dfs(matrix,paths,currentPath+moves[i],nr,nc,n);
            }
            
        }
        matrix[r][c]=temp;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        ArrayList<String> paths=new ArrayList<>();
        
        if(matrix[0][0]==1){
            dfs(matrix,paths,"",0,0,n);
        }
        
        if(paths.size()==0){
            System.out.println("-1");
        }else{
            Collections.sort(paths);
            for(String s:paths){
                System.out.print(s+" ");
            }
        }
    }
}