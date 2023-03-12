import java.util.Stack;

public class stack_pushAtBottom {
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
    public static void main(String args[]){
       
        Stack<Integer>s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        addbottom(s,4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
