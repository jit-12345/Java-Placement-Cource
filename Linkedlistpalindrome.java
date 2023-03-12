public class Linkedlistpalindrome
{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public void push(int data)
    {
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    } 
    public int size(){
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public void printll()
    {
        Node temp=head;
        if(temp==null){
            System.out.println("The Linked List is empty");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public boolean checkpalindraome(){
        //base case
        if (head==null||head.next==null) {
            return true;
            //if the linked list is empty or have only one element then the linked list automatically return true
        }
        //1st find the mid
        Node midnode=findmid(head);
        //2nd reverse 2nd half
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node righthead=prev;//right half head
        
        //3rd check left or right
        Node lefthead=head;//left halr head
        while (righthead!=null) {
           if (righthead.data!=lefthead.data) 
           {
            return false;
           } 
           righthead=righthead.next;
           lefthead=lefthead.next;
        }
        return true;
    }
    // public void reversesecond(){
    //     Node lefthead=findmid(head);
    //     Node prev=null;
    //     Node temp=lefthead;
    //     while(lefthead!=null){
    //         temp=lefthead.next;
    //         lefthead.next=prev;
    //         prev=lefthead;
    //         lefthead=temp;
    //     }
    //     lefthead=prev;
    // }
    public Node findmid(Node head){
        Node slow=head;//jump 1
        Node fast=head;//jemp 2
        while (fast!=null&&fast.next!=null) {
          slow=slow.next;
          fast=fast.next.next;  
        }
        return slow;
    }
    public static void main(String args[]){
        Linkedlistpalindrome ll=new Linkedlistpalindrome();
        ll.printll();
        System.out.println(ll.size());
        ll.push(1);
        ll.push(2);
        ll.push(2);
        ll.push(1);
        ll.printll();
        System.out.println(ll.checkpalindraome());
        
    }
}
