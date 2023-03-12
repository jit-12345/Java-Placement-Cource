public class Queue_LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //add
        public static void add(int data){
            Node newnode=new Node(data);
            if (head==null) {
                head = newnode;
                tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }
        //remove
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int result=head.data;
            //for a single node present
            if (head==tail) {
                head=tail=null;
            }else{
            head=head.next;
            }
            return result;
        }
        //peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

    }
        public static void main(String[] args) {
         Queue q=new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         System.out.println("Queue is look like");
         while (!q.isEmpty()) {
             System.out.println(q.peek());
             q.remove();
         }
         //System.out.println(q.peek());
     }
    
}
