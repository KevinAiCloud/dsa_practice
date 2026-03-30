package iamNeo;

/* Single File Programming Question
Problem Statement



Neo is experimenting with text transformations and decides to use a stack to reverse the sequence of words in his sentence. He provides a line of text and expects the program to utilize a stack to reorder the words so that the last word appears first and the first word appears last. 



Write a program to ensure this is done correctly using a stack-based approach.



Example



Input: I am Neo

Output: Neo am I

Input format :
The input consists of a single line of input containing a sentence with words separated by spaces.

Output format :
The output prints a single line of output containing the words of the sentence reversed in order, separated by a single space.



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ length of input string ≤ 100

Words will not contain newline characters.

Multiple consecutive spaces will not appear in the input.

Sample test cases :
Input 1 :
Hello World
Output 1 :
World Hello
Input 2 :
Neo is preparing for a storytelling competition
Output 2 :
competition storytelling a for preparing is Neo */

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String input=sc.nextLine();
        String words[]= input.split(" ");
        Stack<String> stack= new Stack<>();
        
        for(String word:words){
            stack.push(word);
        }
        
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            if(!stack.isEmpty()){
                System.out.print(" ");
            }
        }
    }
}
