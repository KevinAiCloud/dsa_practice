package iamNeo;

/* Single File Programming Question
Problem Statement



Arun is tasked with implementing a program to reverse a singly linked list. The program should populate the list elements by inserting them at the beginning, traverse the list and reverse the order of its elements.



Since Arun is new to programming, you have to guide him through the task. 

Input format :
The first line of input consists of an integer N, representing the linked list size.

The second line consists of N space-separated list elements.

Output format :
The first line of output prints the list elements after inserting them at the beginning.

The second line prints the reversed linked list.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N ≤ 25

1 ≤ list elements ≤ 1000

Sample test cases :
Input 1 :
5
23 85 47 62 31
Output 1 :
31 62 47 85 23 
23 85 47 62 31 
Input 2 :
8
14 52 36 98 46 82 78 94
Output 2 :
94 78 82 46 98 36 52 14 
14 52 36 98 46 82 78 94  */

import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Main{
    
    static Node insertAtBeginning(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }
    
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        Node head=null;
        
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            head=insertAtBeginning(head,x);
        }
        
        printList(head);
        
        head=reverse(head);
        
        printList(head);
    }
    
}
