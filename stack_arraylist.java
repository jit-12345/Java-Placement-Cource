import java.util.*;
public class stack_arraylist {
    static class stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String args[]){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
