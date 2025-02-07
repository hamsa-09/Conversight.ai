import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
//Queue
class Queue<T>{
  Deque<T> q;
  public Queue(){
    q=new ArrayDeque<>();
  }
  void add(T val){
    q.add(val);
  }
   T poll(){
    if(q.isEmpty()){
        return null;
    }
    return q.pollFirst();
  }
  boolean isEmpty(){
    return q.isEmpty();
  }
  T top(){

    return q.peekFirst();
  }
void print(){
    for (T element : q) {
        System.out.print(element + " ");
    }
    System.out.println();
}
}

//Stack
class Stack<T>{
    Deque<T> st;
     Stack(){
        st=new ArrayDeque<>();
    }
    public void push(T val){
        st.push(val);
    }
    public void pop(){
        System.out.print(st.pop()+" ");
    }
     boolean isEmpty(){
        return st.isEmpty();
    }
    public T top(){
        return st.peek();
    }
}
public class StackQueue {
public static void main(String[] args) {
    System.out.println("Stack:");
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println("Top of the stack : " + st.top());
//POP
 while (!st.st.isEmpty()){
    st.pop();
 }
 System.out.println(" "+st.isEmpty());
 Stack<String> str=new Stack<>();
    str.push("hello");
    str.push("world");
    str.push("goovy");
    System.out.println("Top of the stack : " + str.top());
//POP string
 while (!str.st.isEmpty()){
    str.pop();
 }
   System.out.println(" "+str.isEmpty());

   //  Queue implementation
   System.out.println("Queue:");
    Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Top of the queue: " + queue.top()); // Output: 1
        System.out.println(queue.poll()); // Output: 1
        System.out.println("Top of the queue: " + queue.top()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false

        // Example with String type
        Queue<String> stringQueue = new Queue<>();
        stringQueue.add("Hello");
        stringQueue.add("World");
        System.out.println("Top of the string queue: " + stringQueue.top()); // Output: Hello
        stringQueue.print(); // Output: Hello World
}
}
