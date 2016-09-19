/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.0
* @since   30/08/2016
*/

public class ArrayQueue {
  
  private int capacity;
  private int head = 0;
  private int tail = 0;
  private int[] storage;
  
  public ArrayQueue(int size) {
    capacity = size;
    storage = new int[capacity]; 
  } 

  public void show() {
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[adjust(head+i)]);         
    }
    System.out.println();
    System.out.println("STORAGE STATUS: ");
    System.out.println("Size : " + capacity + " max");
    System.out.println("Empty: " + (capacity-tail) + " left");
    peekHead();
    peekTail();
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (tail == 0) {
      System.out.println("STORAGE IS EMPTY.");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (tail == capacity) {
      System.out.println("STORAGE IS FULL.");
      return true;
    }
    return false;
  }

  public void enqueue(int value) {    
    System.out.println("Enqueueing " + value + " ...");
    if (isFull()) {      
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {
      storage[adjust(head+tail)] = value;
      tail++;
      System.out.println("Done! " + value + " has been added.");
      System.out.println();  
    }     
  }

  public int dequeue() {
    System.out.println("Dequeueing " + storage[head] + " ...");
    if (isEmpty()) {      
      System.out.println("REMOVE FAILED.");
      System.out.println();
      return -1;
    } else {
      int temp = storage[head];
      storage[head] = 0;
      head = adjust(head+1);
      tail--;
      System.out.println("Done! " + temp + " has been removed.");
      System.out.println();
      return temp;      
    }    
  }

  private final int adjust(int i) {
    return (i + capacity) % capacity;
  }

  public int peekHead() {
    System.out.println("Head : " + storage[head]);
    if (isEmpty()) {      
      return -1;
    }
    return 0;
  }

  public int peekTail() {
    if (isEmpty()) {
      System.out.println("Tail : " + storage[adjust(capacity)]); 
      return -1;
    } else if (isFull()) {
      System.out.println("Tail : " + storage[adjust(tail)]); 
      return 0;
    } else if (tail <= capacity) {
      System.out.println("Tail : " + storage[capacity-1]);
      return 0;
    } else if (tail >= capacity) {
      System.out.println("Tail : " + storage[adjust(tail+1)]);
      return 0;
    } else if (!isEmpty() && !isFull()) {
      System.out.println("Tail : " + storage[capacity-1]);
      return 0;
    } else {
      System.out.println("Tail : " + storage[adjust(tail)]);
      return 0;
    }
  }


  public static void main(String[] args) {
    ArrayQueue storage = new ArrayQueue(10);
    storage.enqueue(10);   
    storage.enqueue(20);    
    storage.enqueue(30);    
    storage.enqueue(40);    
    storage.enqueue(50);
    storage.enqueue(60); 
    storage.enqueue(70); 
    storage.enqueue(80); 
    storage.enqueue(90);    
    storage.enqueue(100); 
    storage.dequeue(); 
    storage.dequeue();
    storage.show();
  }  

}