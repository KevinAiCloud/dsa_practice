package iamNeo;
/* 
Single File Programming Question
Problem Statement:



Ravi is building a simple application to manage a doubly linked list of integers. He wants to insert new integers into the list and delete a node at a specific position. After deleting it, he needs to display the updated list. 



Write a program to ensure that the task is done by performing insertion, deletion at a given position, and then printing the modified list.

Input format :
The first line contains an integer n, representing the number of elements to be inserted into the list.

The second line contains n space-separated integers, representing the values to insert.

The third line contains an integer pos, representing the position of the node to be deleted from the list.

Output format :
If the given position is valid, print "Node at position X with value Y deleted successfully".



If the position is invalid, print "Position X not found in the list."



In both cases, print

"Data present in the list:"

followed by the updated list elements on the next line, space separated."



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ n ≤ 10

1 ≤ data ≤ 103

1 ≤ pos ≤ n

Sample test cases :
Input 1 :
5
10 20 30 40 50
4
Output 1 :
Node at position 4 with value 40 deleted successfully.
Data present in the list:
10 20 30 50 
Input 2 :
5
10 52 63 74 85
7
Output 2 :
Position 7 not found in the list.
Data present in the list:
10 52 63 74 85 
*/



import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        data=d;
        next=null;
        prev=null;
    }
}

class doublelinkedlist{
    
    static Node create(Node head, int v){
        Node newnode=new Node(v);
        if(head==null){
            return newnode;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
    
    static Node deletion(Node head, int pos){
        if(head==null){
            System.out.println("Position "+pos+" not found in the list.");
            return head;
        }
        
        Node temp=head;
        
        for(int i=1;i<pos && temp!=null;i++){
            temp=temp.next;
        }
        
        if(temp==null){
            System.out.println("Position "+pos+" not found in the list.");
            return head;
        }

        System.out.println("Node at position "+pos+" with value "+temp.data+" deleted successfully.");
        
        if(temp==head){
            head=head.next;
            if(head!=null){
                temp.prev=null;
            }
        }

        else{
            if(temp.prev!=null){
                temp.prev.next=temp.next;
            }
            if(temp.next!=null){
                temp.next.prev=temp.prev;
            }
        }
        return head;
    }
    
    static void display(Node head){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        Node head=null;
        
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            head = create(head,value);
        }

        int pos=sc.nextInt();
        head=deletion(head,pos);
        System.out.println("Data present in the list:");
        display(head);
    }
}