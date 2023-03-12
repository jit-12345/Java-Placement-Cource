import java.util.*;
public class stack_JCF{
    public static void main(String args[]){
        //implement a stack by JCF
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        //System.out.println(s);
    }
}