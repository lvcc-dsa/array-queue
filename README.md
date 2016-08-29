# Queue
=======================

## Description

 - A QUEUE is an ADT (abstract data type) in FIFO order (first in, first out).
 - It has 2 main operations: (1) ENQUEUE or adding on the tail/back, and (2) DEQUEUE or removing on the head/front.
 - It is a protected SINGLY LINKED LIST where enqueue and dequeue are only allowed on the top front or last element in the queue.
 - You may also PEEK to show the last element added.
 - Implementation can either be in ARRAY or LINKED LIST.
 - It's algorithmic complexity is CONSTANT or O(1) for both ends (enqueue, dequeue).

## To Do:

 - Implement a QUEUE using ARRAY that can hold a maximum of 10 integers.
 - Create operations ENQUEUE, DEQUEUE, and PEEK.
 - Allow ENQUEUE only if the queue is not yet full.
 - Allow DEQUEUE only if the queue is not yet empty.
 - Upon DEQUEUE, shift the element's position accordingly.
 - Allow PEEK to see the topmost topmost element.
 - Show the updated ARRAY QUEUE for every successful ENQUEUE and DEQUEUE.

## Pseudocode:

    START PROGRAM
    
     SET capacity, head, tail, items, queue[]
     SET tail = items-1
         
     PROCEDURE show
      FOR EACH value IN queue.capacity
       PRINT queue[adjust(head.next)]
    
     PROCEDURE isEmpty
      IF items == 0
       PRINT queue is empty
       return TRUE
    
     PROCEDURE isFull
     IF items == capacity
       PRINT queue is full
       return TRUE
    
     PROCEDURE enqueue(value)
      IF isFull
       PRINT add failed.
      ELSE        
        PRINT trying to enqueue on queue[tail]
        queue[adjust head items] = value
        items++
        PRINT element was successfully added
    
     PROCEDURE dequeue
      IF isEmpty
       PRINT remove failed.
      ELSE
       PRINT trying to dequeue head
       int temp = storage[head];
       queue[head] = 0
       head.next = head
       head--
       PRINT queue[head] was successfully removed
      
     PROCEDURE peekHead
      IF isEmpty
       PRINT 0
      ELSE 
       PRINT head
     
     PROCEDURE peekTail
      IF isEmpty
       PRINT 0
      ELSE 
       PRINT tail
    
     PROCEDURE main
     // show that queue is empty
     // enqueue 10 integers until queue is full
     // show updated queue
     // try to enqueue again, return error message
     // dequeue last element
     // peek last element
     // dequeue all elements until queue is empty
     // show updated queue
     // try to dequeue again, return error message
    
    END PROGRAM
