package iamNeo;

/* Single File Programming Question
Problem Statement:



You are working on a text editor's optimization feature that simplifies strings by removing certain patterns. Given a string consisting only of uppercase English letters, the feature allows you to apply the following operation:



Remove any occurrence of the substrings "AB" or "CD".
After removing a substring, the remaining parts of the string concatenate, potentially forming new "AB" or "CD" substrings.


Your task is to find the minimum possible length of the resulting string after repeatedly applying this operation until no more "AB" or "CD" substrings can be removed.



Example:

Input: 

ABFCACDB



Output: 

2



Explanation: We can do the following operations:

- Remove the substring "ABFCACDB" = "FCACDB".

- Remove the substring "FCACDB" = "FCAB".

- Remove the substring "FCAB" = "FC".

So the resulting length of the string is 2.

Input format :
A single string consisting only of uppercase English letters.

Output format :
A single integer representing the minimum possible length of the resulting string after performing all possible operations.



Refer to the sample output for formatting specifications.

Code constraints :
1 < string length < 100

Sample test cases :
Input 1 :
ABFCACDB
Output 1 :
2
Input 2 :
ACBBD
Output 2 :
5 */


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        Stack<Character> stack=new Stack<>();
        
        for(char ch: s.toCharArray()){
            
            if(!stack.isEmpty()){
                char top=stack.peek();
                
                if((top=='A' && ch=='B') || (top=='C' && ch=='D')){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        System.out.println(stack.size());
    }
}
