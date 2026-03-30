package iamNeo;

/* Single File Programming Question
Problem Statement



Gokul is working on a program to rearrange elements in a queue. Given a queue of integers, he needs to modify it by interleaving its first half with the second half. Write a program to help Gokul achieve this task using a queue.



Note:  Interleaving involves merging elements from two separate halves in an alternating fashion to create a new sequence.



Example

Input 

6

1 2 3 7 9 5

Output 

1 7 2 9 3 5 



Explanation

The interleave rearranges elements in a queue by alternating between two halves. For instance, given input [1, 2, 3, 7, 9, 5], it splits into [1, 2, 3] and [7, 9, 5], then interleaves them as [1, 7, 2, 9, 3, 5]. It achieves this by splitting the queue into two halves and then merging them in an interleaved manner.

Input format :
The first line of input consists of an integer n, representing the number of elements in the queue.

The second line consists of n space-separated integers, representing the queue elements.

Output format :
The output prints n space-separated integers, representing the rearranged queue after interleaving its first half with the second half.



Refer to the sample output for formatting specifications.

Code constraints :
2 ≤ n ≤ 10, where n will always be even.

1 ≤ queue elements ≤ 1000

Sample test cases :
Input 1 :
6
1 2 3 7 9 5
Output 1 :
1 7 2 9 3 5 
Input 2 :
4
14 62 56 41
Output 2 :
14 56 62 41  */


import java.util.*;

class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        
        Queue<Integer> firstHalf=new LinkedList<>();
        
        for(int i=0 ; i<n/2 ; i++){
            firstHalf.add(q.remove());
        }
        
        while(!firstHalf.isEmpty()){
            System.out.print(firstHalf.remove()+" ");
            System.out.print(q.remove()+" ");
        }
    }
}