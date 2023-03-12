import java.util.*;
public class reverse_stack {
    public static void addbottom(Stack<Integer>s,int data){
        //base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        addbottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        //base case
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        addbottom(s, top);
    }
    public static void PrintStack(Stack<Integer>s){
        while (!s.empty()) {
            System.out.println(s.pop());
            
        }
    }
    public static void main(String[] args) {
            Stack<Integer>s=new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
           // PrintStack(s);
            reverseStack(s);
            System.out.println();
            PrintStack(s);
    }
}
