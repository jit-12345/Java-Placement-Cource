public class Doubly_Linked_List {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void add(int data){
      Node newnode=new Node(data);
      if (head==null) {
        head=tail=newnode;
        return;
      }  
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
    }
    public void removefirst(){
        head=head.next;
        head.prev=null;
    }
    public void printll(){
        Node temp=head;
        System.out.print("The LinkedList element are");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse_dll(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
    public static void main(String args[]){
        Doubly_Linked_List dll=new Doubly_Linked_List();
        dll.add(5);
        dll.add(1);
        dll.add(8);
        dll.add(2);
        dll.printll();
        dll.reverse_dll();
        dll.printll();
        dll.removefirst();
        dll.printll();
    }
}
