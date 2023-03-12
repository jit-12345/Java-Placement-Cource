import java.util.Stack;

public class Stack_Duplicate_Parenthesis {
    public static boolean Check_duplicate(String str)
{
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) 
    {
            char ch=str.charAt(i);
        if (ch==')') //closing
        {
            int count=0;
            while (s.peek()!='(') 
            {
                s.pop();
                count++;
            }
            if (count<1) {
              return true;  
            }
        }
        else{
           //opening
           s.push(ch); 
        }
    }
    return false;
}
    public static void main(String args[]){
        //It's given that the string is already valid
        String str1="((a+b))";//duplicate true
        String str2="(a+b)";//duplicate false
        System.out.println(Check_duplicate(str2));
    }

}
