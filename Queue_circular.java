public class Queue_circular {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        //here we also count the front
        static int front;
 
         Queue(int n){
             arr=new int[n];
             size=n;
             rear=-1;
             front=-1;
         }
         //check empty
         public static boolean isEmpty(){
             return (rear==-1&&front==-1);
         } 
         //check full
         public static boolean isFull(){
            //approch 1
        //    if (rear+1=front) {
        //     return true;
        //    }
        //    return false;

        //approch 2
            return (rear+1)%size==front;
         }
         //add
         public static void add(int data){
             if (isFull()) {
                System.out.println("Queue is full");
                return;
             }
             //add first element
             if(front==-1){
                front=0;
             }
             rear=(rear+1)%size;
             arr[rear]=data;
             return;
         }
         //remove
         public static int remove(){
             if (isEmpty()) {
                 System.out.println("Queue is empty");
                 return -1;
             }
             int temp=arr[front];
             if (front==rear) {
                front=rear=-1;
             }
             else{
             front=(front+1)%size;
             }
             return temp;    
         }
         //peek
         public static int peek(){
             if (isEmpty()) {
                 System.out.println("Queue is empty");
                 return -1;
             }
             return arr[front];
         }
     }
     public static void main(String[] args) {
         Queue q=new Queue(3);
         q.add(1);
         q.add(2);
         q.add(3);
         System.out.println(q.remove());
         q.add(12);
         System.out.println(q.remove());
         q.add(35);
         System.out.println("Queue is look like");
         while (!q.isEmpty()) {
             System.out.println(q.peek());
             q.remove();
         }
         //System.out.println(q.peek());
     }
}
