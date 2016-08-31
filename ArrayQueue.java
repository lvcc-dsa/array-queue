
public class dsaqueue {
  
  // note: variable declarations
  private int capacity; // note: optional, you may also use array.length
  private int head = 0; // note: value of front item
  private int tail = 0; // note: counter number of tail
  private int[] storage; // note: array is of integer values
  
  // note: constructor = initialize an object instance of the class
  public dsaqueue(int size) {
    capacity = size; // note: optional, can directly pass a new int[size]
    storage = new int[capacity];
    // todo: initialize values for tail, head, and tail
  } 

  // note: will display the array
  public void show() {
    // note: the top of the queue starts from array[0] then newer item gets added on the tail and removes in the front
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[i]); // todo: use adjust(head+i) to adjust each item's position
    }
      System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (tail == 0) { // note: checks if numbers tail has reached 0 or empty
      System.out.println("the queue is empty"); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  private boolean isFull() {
    if (tail == capacity) { // note: compares if number of tail has reached capacity limit
      System.out.println("the queue is full"); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the tail of array
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + (tail-1) + "] ...");
      System.out.println("the queue is full, please remove some value"); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      storage[tail] = value; // todo: assign the value to the adjusted position of head
      tail++; // todo: should increment or decrement?
      System.out.println(value + " was successfully added."); // todo: what does enqueue do?
      System.out.println(); // note: prints optional new line for readability
    }
  }

  // note: will remove value to the head of array
  public int dequeue() {    
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println("... trying to dequeue head ...");
      System.out.println("the queue is empty, please add dome value"); // print error message here
      System.out.println(); // prints optional new line for readability
    } else {  
      System.out.println("... trying to dequeue head ...");
      storage[head] = 0; // todo: now, empty the value of current head
      for (int i = 0; i < tail; i++){
          storage[i]=storage[i+1];
          
      }
      tail--; // todo: should increment or decrement?
      System.out.println(head + " was successfully remove."); // todo: what does dequeue do?
      System.out.println(); // note: prints optional new line for readability
     // note: returns the temp as head
    }
    return 0; // note: returns the temp as head
  }

  // note: will show the front value or head of the array
  public int peekHead() {
    System.out.println("Head : " + storage[head]);
    if (isEmpty()) {
      return -1;
    }    
    System.out.println();
    return 0;
  }

  // note: will show the front value or head of the array
  public int peekTail() {
    System.out.println("Tail : " + storage[tail-1]);
    if (isEmpty()) {      
      return -1;
    }
    System.out.println();
    return 0;
  }

  public static void main(String[] args) {
      dsaqueue storage = new dsaqueue(10);
    // note: construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE size = " + storage.capacity); // todo: return the capacity limit of storage
    System.out.println();
    storage.enqueue(111111);
    storage.enqueue(222222);
    storage.enqueue(333333);
    storage.enqueue(444444);
    storage.enqueue(555555);
    storage.enqueue(66);
    storage.enqueue(77);
    storage.enqueue(88);
    storage.enqueue(99);
    storage.enqueue(10);
    storage.dequeue();
    storage.dequeue();
    storage.show();
  }  
  
