
/* Single File Programming Question
Problem Statement



Raj is a computer science teacher who is teaching his students about data structures and stack operations. He wants to demonstrate the concept of stacks to his students by implementing a simple character stack program using linked lists.



Raj's task is to write a program that allows users to push characters onto a stack, pop characters from the stack, display the stack's contents, and exit the program when desired. 



He wants you to help him to create this program.

Input format :
The input consists of integers corresponding to the operation that needs to be performed:



Choice 1: Push the character onto the stack. If the choice is 1, the following input is a space-separated character, representing the element to be pushed onto the stack.
Choice 2: Pop a character from the stack
Choice 3: Display the elements in the stack.
Choice 4: Exit the program.
Output format :
The output displays messages according to the choice and the status of the stack:



If the choice is 1, push the given character to the stack and display the following: "Pushed element: [character]".
If the choice is 2, pop the character from the stack and display the following: "Popped element: [character]".
If the choice is 2, and if the stack is empty without any elements, print "Stack is empty. Cannot pop."
If the choice is 3, print the elements in the stack in the following: "Stack elements (top to bottom): " followed by the characters separated by spaces.
If the choice is 3 and there are no elements in the stack, print "Stack is empty"
If the choice is 4, exit the program and display the following message: "Exiting program"
If any other choice is entered, print "Invalid choice"


Refer to the sample output for the exact format.

Code constraints :
1 ≤ n ≤ 10

1 ≤ elements ≤ 10

Sample test cases :
Input 1 :
1 A
1 C
3
2
3
4
Output 1 :
Pushed element: A
Pushed element: C
Stack elements (top to bottom): C A 
Popped element: C
Stack elements (top to bottom): A 
Exiting program
Input 2 :
1 a
2
2
4
Output 2 :
Pushed element: a
Popped element: a
Stack is empty. Cannot pop.
Exiting program
Input 3 :
3
4
Output 3 :
Stack is empty
Exiting program */


import java.util.*;

class Node{
    char data;
    Node next;
    
    Node(char d){
        data=d;
        next=null;
    }
}

class Main{
    static Node top=null;
    
    static void push(char ch){
        Node newNode = new Node(ch);
        newNode.next=top;
        top=newNode;
        System.out.println("Pushed element: "+ch);
    }
    
    static void pop(){
        if(top==null){
            System.out.println("Stack is empty. Cannot pop.");
        }
        else{
            System.out.println("Popped element: "+top.data);
            top=top.next;
        }
    }
    
    static void display(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack elements (top to bottom): ");
        Node temp=top;
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        while(sc.hasNext()){
            int choice=sc.nextInt();
            
            if(choice==1){
                char ch=sc.next().charAt(0);
                push(ch);
            }
            
            else if(choice==2){
                pop();
            }
            
            else if(choice==3){
                display();
            }
            
            else if(choice==4){
                System.out.println("Exiting program");
                break;
            }
            
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}