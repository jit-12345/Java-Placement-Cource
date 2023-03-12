import java.util.*;
public class Queue_2_Stack 
{
  static class Queue
{
     static Stack<Integer>s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();
    //isEmpty
    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    //add --O(n)
    public static void add(int data)
    {
        //all s1 element push in the s2 stack
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        //push the value in s1
        s1.push(data);

        //then again copy the s2 element in the s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }

    //remove
    public static int remove(){
        if (isEmpty()) {
           System.out.println("Queue is empty"); 
           return -1;
        }
        return s1.pop();
    }

    //peek
    public static int peek(){
        while (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        return s1.peek();
    }
}
  
  public static void main(String[] args) 
  {
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    while (!q.isEmpty()) 
    {
        System.out.println(q.peek());
        q.remove();
    }
  }
}
