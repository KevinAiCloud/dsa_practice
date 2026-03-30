package iamNeo;

/* Single File Programming Question
Problem Statement



Sita is developing an order processing system for a company. To efficiently manage incoming orders, she decides to implement a queue data structure using an array. The queue will store order IDs. 



Implement the following operations:

Insert Order: Add an order ID to the end of the queue.

Process Order: Remove and process the next order ID from the queue.

Display Queue: Display the order IDs in the queue.

Input format :
Each line contains an integer representing the chosen option from 1 to 3.

Option 1: Enqueue a new order ID into the queue. The next line contains an integer representing the element to be inserted.

Option 2: Dequeue an order ID from the queue for processing.

Option 3: Display the list of order IDs currently in the queue.

Output format :
The program provides appropriate outputs based on the choice:

When enqueuing an order (option 1), the program outputs:

"Order ID <orderID> is inserted in the queue"

When dequeuing an order (option 2), the program outputs:

"Processed Order ID: <orderID>"

When displaying the order IDs (option 3), the program outputs:

"Order IDs in the queue are: <orderID1> <orderID2> ... <orderIDn>"

If an enqueue operation is attempted when the queue is full, the program outputs:

"Queue is full"

If a dequeue operation is attempted when the queue is empty, the program outputs:

"Queue is empty"

If the user provides an invalid option, the program outputs:

"Invalid option"



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

The maximum size of the queue is defined as max = 5.

The queue can store integer values.

Each order is identified by a unique positive integer order ID.

The order IDs are sequential, starting from 1.

Sample test cases :
Input 1 :
1
10
1
88
3
2
3
Output 1 :
Order ID 10 is inserted in the queue
Order ID 88 is inserted in the queue
Order IDs in the queue are: 10 88 
Processed Order ID: 10
Order IDs in the queue are: 88 
Input 2 :
1
30
2
3
5
Output 2 :
Order ID 30 is inserted in the queue
Processed Order ID: 30
Queue is empty
Invalid option
Input 3 :
1
10
1
20
1
30
1
40
1
50
1
60
Output 3 :
Order ID 10 is inserted in the queue
Order ID 20 is inserted in the queue
Order ID 30 is inserted in the queue
Order ID 40 is inserted in the queue
Order ID 50 is inserted in the queue
Queue is full */


import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int max=5;
        int queue[]=new int[max];
        
        int front=-1;
        int rear=-1;
        
        while(sc.hasNext()){
            int choice=sc.nextInt();
            
            if(choice==1){
                int val=sc.nextInt();
                if(rear == max-1){
                    System.out.println("Queue is full");
                }
                else{
                    if(front==-1) front=0;
                    rear++;
                    queue[rear]=val;
                    System.out.println("Order ID "+val+" is inserted in the queue");
                }
            }
            
            else if(choice==2){
                if(front==-1 || front>rear){
                    System.out.println("Queue is empty");
                }
                else{
                    System.out.println("Processed Order ID: "+queue[front]);
                    front++;
                }
            }
            
            else if(choice==3){
                if(front==-1 || front>rear){
                    System.out.println("Queue is empty");
                }else{
                    System.out.print("Order IDs in the  queue are: ");
                    for(int i=front; i<=rear; i++){
                        System.out.print(queue[i]+" ");
                    }
                    System.out.println();
                }
            }
            
            else{
                System.out.println("Invalid option");
            }
        }
    }
}