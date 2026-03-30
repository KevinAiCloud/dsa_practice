package iamNeo;

/* Single File Programming Question
Problem Statement



Tanya is working on a software module that simulates basic stack operations for learning purposes. She is using an array-based stack to store integers. As part of the task, she needs to:



Push a series of numbers onto the stack,
Find the minimum element currently in the stack,
Pop the top element, and
Again, find the minimum element after the pop operation.


However, her implementation is not giving the correct minimum values after popping an element.



Help Tanya fix her program so that it correctly tracks the minimum element in the stack before and after a pop operation.

Input format :
The first line of input consists of an integer N, representing the number of elements to push onto the stack.

The second line consists of N space-separated integer values, representing the elements to be pushed onto the stack.

Output format :
The first line of output prints "Minimum element in the stack: " followed by an integer representing the minimum element in the stack.

The second line prints "Popped element: " followed by an integer representing the popped element.

The third line prints "Minimum element in the stack after popping: " followed by an integer representing the minimum element in the stack after popping.



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

2 ≤ N ≤ 20

1 ≤ elements in the stack ≤ 100

Sample test cases :
Input 1 :
4
5 2 8 1
Output 1 :
Minimum element in the stack: 1
Popped element: 1
Minimum element in the stack after popping: 2
Input 2 :
11
7 4 9 1 15 8 2 14 6 10 3
Output 2 :
Minimum element in the stack: 1
Popped element: 3
Minimum element in the stack after popping: 1 */


import java.util.*;

class Stacks{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    void push(int v){
        stack.push(v);
        if(minStack.isEmpty() || v<=minStack.peek()){
            minStack.push(v);
        }
    }
    
    int pop(){
        int popped=stack.pop();
        if(popped==minStack.peek()){
            minStack.pop();
        }
        return popped;
    }
    
    int minimum(){
        return minStack.peek();
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        Stacks ss=new Stacks();
        
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            ss.push(value);
        }
        
        System.out.println("Minimum element in the stack: "+ss.minimum());
        
        int popped=ss.pop();
        System.out.println("Popped element: "+popped);
        
        System.out.println("Minimum element in the stack after popping: "+ ss.minimum());
    }
}
