/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayQueue {
  
  // note: variable declarations
  private int capacity; // note: optional, you may also use array.length
  private int head; // note: value of front item
  private int tail; // note: optional, just to demo
  private int items; // note: counter number of items
  private int[] storage; // note: array is of integer values
  
  // note: constructor = initialize an object instance of the class
  public ArrayQueue(int size) {
    capacity = size; // note: optional, can directly pass a new int[size]
    storage = new int[capacity];
    // todo: initialize values for items, head, and tail
  } 

  // note: will display the array
  public void show() {
    // note: the top of the queue starts from array[0] then newer item gets added on the tail and removes in the front
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[]); // todo: use adjust(head+i) to adjust each item's position
    }
      System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (items == 0) { // note: checks if numbers items has reached 0 or empty
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  private boolean isFull() {
    if (items == capacity) { // note: compares if number of items has reached capacity limit
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the tail of array
  public void enqueue(int value) {
    tail = items-1; // note: tail is last item with value
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {
      System.out.println("... trying to enqueue on queue[" + items + "] ...");
      storage[adjust(head + items)]; // todo: assign the value to the adjusted position of head
      items; // todo: should increment or decrement?
      System.out.println(value + " was successfully _________."); // todo: what does enqueue do?
      System.out.println(); // note: prints optional new line for readability
    }
  }

  // note: will remove value to the head of array
  public int dequeue() {    
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println("... trying to dequeue head ...");
      System.out.println(" "); // print error message here
      System.out.println(); // prints optional new line for readability
    } else {  
      System.out.println("... trying to dequeue head ...");
      int temp; // todo: pass the value of head to a temporary variable
      storage[head]; // todo: now, empty the value of current head
      adjust(head + 1); // todo: pass the next value as new head
      items; // todo: should increment or decrement?
      System.out.println(head + " was successfully _________."); // todo: what does dequeue do?
      System.out.println(); // note: prints optional new line for readability
      return temp; // note: returns the temp as head
    }
    return 0; // note: returns the temp as head
  }

  // note: will wrap the array so we can adjust the position of each value towards the head of array
  private final int adjust(int i) {
    return (i + capacity) % capacity; 
  }

  // note: will show the front value or head of the array
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

  // note: will show the front value or head of the array
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
    // note: construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE size = " + ); // todo: return the capacity limit of storage
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