import java.util.Stack;

public class Stack_NextGreaterElement {
    public static void Calculate_next_greater(int arr[],int newarr[]){
        Stack<Integer>s=new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            int curr=arr[i];
            while (!s.isEmpty()&&curr>arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                newarr[i]=-1;
            }
            else{
                newarr[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int newarr[]=new int[arr.length];
        Calculate_next_greater(arr,newarr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}
