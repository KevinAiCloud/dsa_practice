package iamNeo;

/* Single File Programming Question
Problem Statement



A financial analytics company is developing a tool to analyze stock price trends. The tool needs to identify the Next Greater Price for each stock price in a given list of daily prices. For a given stock price, the Next Greater Price is defined as the first price appearing after it in the list that is greater. If no such price exists, the result should be -1.



Note: The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 



Examples: 



Input format :
The first line of input consists of an integer n, representing the size of the array.

The second line consists of n space-separated stack of integers.

Output format :
The output prints "Next Greater Elements: " followed by an array of integers, representing the next greater elements in the stack.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ n ≤ 12

0 ≤ arr[i] ≤ 50

Sample test cases :
Input 1 :
4
4 5 2 25
Output 1 :
Next Greater Elements: 5 25 25 -1 
Input 2 :
4
13 7 6 12
Output 2 :
Next Greater Elements: -1 12 12 -1 
Input 3 :
4
50 40 30 10
Output 3 :
Next Greater Elements: -1 -1 -1 -1 
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.
 */


import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        int result[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=stack.peek();
            }
            
            stack.push(arr[i]);
        }
        
        System.out.print("Next Greater Elements: ");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}