import java.util.LinkedList;
public class InbuiltLinkedList {
  public static void main(String[] args) {
    //create
    LinkedList<Integer>ll=new LinkedList<>();
    //addfirst
    ll.addFirst(2);
    ll.addFirst(1);
    //addlast
    ll.addLast(3);
    ll.addLast(4);
    //removefirst
    ll.removeFirst();
    //removelast
    ll.removeLast();
    //print the linked list
    System.out.println(ll);
  }  
}
