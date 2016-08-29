/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.0
* @since   29/08/2016
*/

public class ArrayQueue {
  
  private int capacity;
  private int head;
  private int tail;
  private int items;
  private int[] storage;
  
  public ArrayQueue(int size) {
    capacity = size;
    storage = new int[capacity];
    items = 0;
    head = 0;    
    tail = 0;
  } 

  public void show() {
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[adjust(head+i)]);
    }
      System.out.println();
  }
  
  private boolean isEmpty() {
    if (items == 0) {
      System.out.println("STORAGE IS EMPTY.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (items == capacity) {
      System.out.println("STORAGE IS FULL.");
      System.out.println();
      return true;
    } 
    return false;
  }

  public void enqueue(int value) {
    tail = items-1;    
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {
      System.out.println("... trying to enqueue on queue[" + items + "] ...");
      storage[adjust(head + items)] = value;
      items++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public int dequeue() {    
    if (isEmpty()) {
      System.out.println("... trying to dequeue head ...");
      System.out.println("REMOVE FAILED.");
      System.out.println();
    } else {  
      System.out.println("... trying to dequeue head ...");
      int temp = storage[head];
      storage[head] = 0;
      head = adjust(head + 1);
      items--;
      System.out.println(head + " was successfully removed.");
      System.out.println();
      return temp;
    }
    return 0;
  }

  private final int adjust(int i) {
    return (i + capacity) % capacity;
  }

  public int peekHead() {
    if (isEmpty()) {
      System.out.println("PEEK HEAD = NULL");
      System.out.println();
      return -1;
    }
    System.out.println("PEEK HEAD = " + storage[head]);
    System.out.println();
    return 0;
  }

  public int peekTail() {
    tail = items-1;
    if (isEmpty()) {
      System.out.println("PEEK TAIL = NULL");
      System.out.println();
      return -1;
    }
    System.out.println("PEEK TAIL = " + storage[tail]);
    System.out.println();
    return 0;
  }

  public static void main(String[] args) {
    ArrayQueue storage = new ArrayQueue(10);
    System.out.println("STORAGE size = " + storage.capacity);
    System.out.println();
    storage.show(); // show empty queue
    storage.dequeue(); // can't remove on empty queue
    storage.peekHead(); // peek head element
    storage.peekTail(); // peek tail element
    storage.enqueue(1); //
    storage.show(); 
    storage.peekHead(); // peek head element
    storage.peekTail(); // peek tail element
    storage.enqueue(2);
    storage.show();
    storage.peekHead(); // peek head element
    storage.peekTail(); // peek tail element
    storage.enqueue(3);
    storage.show();
    storage.peekHead(); // peek head element
    storage.peekTail(); // peek tail element
    storage.enqueue(4);
    storage.show();
    storage.enqueue(5); 
    storage.show(); 
    storage.dequeue(); // try removing the head
    storage.enqueue(6); 
    storage.enqueue(7); 
    storage.enqueue(8); 
    storage.enqueue(9);    
    storage.enqueue(10); 
    storage.show();
    storage.peekHead(); // peek head element
    storage.peekTail(); // peek tail element
    storage.enqueue(11); // will be added, queue is not full
    storage.show();
    storage.enqueue(12); // can't add on full queue
    storage.enqueue(13); // can't add on full queue
    storage.show();
    storage.dequeue(); // remove 2
    storage.dequeue(); // remove 3
    storage.dequeue(); // remove 4
    storage.dequeue(); // remove 5
    storage.show();
  }  

}