package iamNeo;

/* Single File Programming Question
Problem Statement



Dhruv is working on a project where he needs to implement a Binary Search Tree (BST) data structure and perform various operations on it.



He wants to create a program that allows him to build a BST, traverse it in different orders (inorder, preorder, postorder), and exit the program when needed.



Help Dhruv by designing a program that fulfils his requirements.

Input format :
The first input consists of the choice.

If the choice is 1, enter the number of elements N and the elements inserted into the tree, separated by a space in a new line.

If the choice is 2, print the in-order traversal.

If the choice is 3, print the pre-order traversal.

If the choice is 4, print the post-order traversal.

If the choice is 5, exit.

Output format :
The output prints the results based on the choice.

For choice 1, print "BST with N nodes is ready to use," where N is the number of nodes inserted.

For choice 2, print the inorder traversal of the BST after "BST Traversal in INORDER"

For choice 3, print the pre-order traversal of the BST after "BST Traversal in PREORDER"

For choice 4, print the post-order traversal of the BST after "BST Traversal in POSTORDER"

For choice 5, the program exits.

If the choice is greater than 5, print "Wrong choice".



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ N ≤ 50

Sample test cases :
Input 1 :
1
5
12 78 96 34 55
2
3
4
5
Output 1 :
BST with 5 nodes is ready to use
BST Traversal in INORDER
12 34 55 78 96 
BST Traversal in PREORDER
12 78 34 55 96 
BST Traversal in POSTORDER
55 34 96 78 12 
Input 2 :
1
9
7 9 6 3 2 1 4 5 8
2
4
1
4
98 76 45 27
3
5
Output 2 :
BST with 9 nodes is ready to use
BST Traversal in INORDER
1 2 3 4 5 6 7 8 9 
BST Traversal in POSTORDER
1 2 5 4 3 6 8 9 7 
BST with 4 nodes is ready to use
BST Traversal in PREORDER
98 76 45 27 
Input 3 :
13
5
Output 3 :
Wrong choice */


import java.util.*;

class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Main{
    
    static Node root=null;
    
    static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            int choice=sc.nextInt();
            
            if(choice==1){
                int n=sc.nextInt();
                root=null;
                
                for(int i=0;i<n;i++){
                    int val=sc.nextInt();
                    root=insert(root,val);
                }
                System.out.println("BST with "+n+" nodes is ready to use");
            }
            else if(choice==2){
                System.out.println("BST Traversal in INORDER");
                inorder(root);
                System.out.println();
            }
            else if(choice==3){
                System.out.println("BST Traversal in PREORDER");
                preorder(root);
                System.out.println();
            }
            else if(choice==4){
                System.out.println("BST Traversal in POSTORDER");
                postorder(root);
                System.out.println();
            }
            else if(choice==5){
                break;
            }
            else{
                System.out.println("Wrong choice");
            }
        }
    }
}