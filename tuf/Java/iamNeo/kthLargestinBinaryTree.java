package iamNeo;

/* Single File Programming Question
Problem Statement



You are preparing for a technical interview with a well-known tech company. During a mock interview, you are presented with a coding challenge related to Binary Search Trees (BSTs). 



The challenge is to write a program that finds the kth largest element in a BST, and you are required to implement an efficient solution. 



Your task is to complete the code and ensure that it correctly identifies the kth largest element in the given input tree.

Input format :
The first line of input consists of a sequence of integers representing the elements of the BST. The input is terminated by -1.

The second line consists of an integer k, representing the position of the desired largest element.

Output format :
The output prints a single integer, which is the kth largest element in the BST.



Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ Number of nodes in the BST ≤ 50

1 ≤ Values of nodes in the BST ≤ 150

1 ≤ k ≤ Number of nodes in the BST

Sample test cases :
Input 1 :
10 5 20 3 7 15 25 -1
2
Output 1 :
20
Input 2 :
45 30 60 20 35 55 70 15 25 40 50 58 65 75 -1
11
Output 2 :
30 */


import java.util.*;

class Node{
    int data;
    Node left,right;
    
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Main{
    
    static Node root=null;
    static int count=0;
    static int result=-1;
    
    static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        
        if(val<root.data)
            root.left=insert(root.left, val);
        else
            root.right=insert(root.right, val);
            
        return root;
    }
    
    static void findKthLargest(Node root, int k){
        if(root==null || count>=k) return;
        
        findKthLargest(root.right,k);
        
        count++;
        if(count==k){
            result=root.data;
            return;
        }
        
        findKthLargest(root.left, k);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int val=sc.nextInt();
            if(val==-1) break;
            root=insert(root,val);
        }
        
        int k=sc.nextInt();
        findKthLargest(root,k);
        System.out.println(result);
    }
}