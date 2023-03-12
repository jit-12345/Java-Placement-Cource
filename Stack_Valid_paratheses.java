import java.util.Stack;

public class Stack_Valid_paratheses {
    public static boolean Check_valid(String str)
    {
        Stack< Character>s=new Stack<>();
for (int i = 0; i < str.length(); i++) 
{
            char ch=str.charAt(i);
        if (ch == '('||ch == '{'||ch == '[') //opening
        {
            s.push(ch);
        }
    else//closing
    {
        if (s.isEmpty()) 
        {
            return false;
        }
        if ((ch==')' && s.peek()=='(')
        ||(ch=='}' && s.peek()=='{')
        ||(ch==']' && s.peek()=='[')) 
        {
            s.pop();
        }
        else
        {
            return false;
        }

    }
       
}
    if (s.empty()) 
    {
        return true;
    }else{
        return false;
    }
    
}
    public static void main(String[] args) {
        String str="({[]}())(";
        boolean result=Check_valid(str);
        if (result) {
            System.out.println("The string is valid");
            return;
        }
        else{
            System.out.println("The string is not valid");
        }
    }
}
