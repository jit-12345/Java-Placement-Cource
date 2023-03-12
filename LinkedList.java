public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    // methods to doing the operation
    // static do not required because main function only call static function but we
    // made a object in linkedlist type so we didn't required it

    public void addFirst(int data) {
        // step 1=create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        // step 2=newnode next=head
        newnode.next = head;// link
        // step 3:head=newnode;
        head = newnode;

    }

    public void addLast(int data) {
        // step 1 :make a new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2: link with new node
        tail.next = newnode;
        // step 3: declare tail as newnode
        tail = newnode;
    }

    public void addmiddle(int data, int index) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        Node temp = head;
        int count = 0;//the linked list is added after the given index not before
        while (count != index - 1) {
            temp = temp.next;
            count++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void printll() {// O(n) -time complexity
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int llsize() {
        Node temp = head;
        // if (head==null) {
        // return 0;
        // }

        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public int removefirst() {
        if (llsize() == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if (llsize() == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        int val = head.data;
        head = head.next;
        temp.next = null;
        return val;
    }

    public int removelast() {
        if (llsize() == 0) {
            System.out.println("No Node present in the LinkedList");
            return Integer.MIN_VALUE;
        }
        if (llsize() == 1) {
            int val = head.data;
            head = tail = null;
            // llsize()=0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < llsize() - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        // llsize()=llsize()-1;
        return val;
    }

    public int iteSearch(int key) {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recSearch(int key, Node temp) {

        // base case
        if (temp == null) {
            return -1;
        }
        // kaam
        if (temp.data == key) {

            return 1;
        }
        // recursion
        int idx = recSearch(key, temp.next);
        if (idx >= 1) {
            idx++;
        }
        return idx;
    }

    public void itrreverse() {
        Node next = head;
        Node prev = null;
        // kaam
        while (next != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            if (next != null) {
                head = next;
            }
        }
    }

    // public void searchdelete(int key){
    // Node temp=head;
    // while (temp.next.data!=key) {
    // temp=temp.next;
    // }
    // temp.next=temp.next.next;
    // }
    public void deleteend(int n) {
        Node temp = head;
        int i = 1;
        int sz = 0;
        if (n == sz) {
            head = head.next;// remove first
            return;
        }
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        int iToReach = sz - n;
        Node prev = head;
        while (i < iToReach) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
           slow=slow.next;
           fast=fast.next.next;
           if (slow==fast) {//use the if condition after increment of slow and fast neother infirst node slow and fast is in the same position
            return true;//cycle exist
           }
        }
        return false;//cycle does not exist;
    }
    public static void removecycle(){
        //detect cycle
        if (iscycle()==false) {
            return;
        }

        //find meeting point
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                slow=head;
                break;
            }
        }

        //remove cycle ->last.next=null;
       Node temp=null;
        while (slow!=fast) {
         slow=slow.next;
         temp=fast;
         fast=fast.next;   
        }
        temp.next=null;
    }
    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null&&head2!=null){
            if(head1.data>=head2.data){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }else{
                temp=head1;
                head1=head1.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node merge_sort(Node head){
        removecycle();
        //base case
        if(head==null||head.next==null){
            return head;
        }

        //find mid
        Node mid=null;
        Node slow =head;
        Node fast=head.next;//to find mid in first half always start fast from head.next
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;

        //left & right mergesort
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft= merge_sort(head);
        Node newRight= merge_sort(righthead);

        //merge
        return merge(newLeft,newRight);
    }
    public Node getmid(){
        //to find the mid

        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;
        }  
        return slow;
    }
    public void zigzag(){
        //find the mid

        Node mid= getmid();

        //reverse the second half;
        
        Node Righthead=mid.next;
        mid.next=null;
        Node prev=null;
        Node curr=Righthead;
        Node next=null;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //merge into zigzag

        Node Lefthead=head;
        Righthead=prev;
        Node nextLeft=null;
        Node nextRight=null;
        while (Righthead!=null && Lefthead!=null) {
            nextLeft=Lefthead.next;
            Lefthead.next=Righthead;
            nextRight=Righthead.next;
            Righthead.next=nextLeft;
            //update the loop;
            Righthead=nextRight;
            Lefthead=nextLeft;
            
        }

    }

    // public static void main(String[] args) {
    //     LinkedList ll = new LinkedList();
    //     ll.printll();
    //     System.out.println("The size of the linkedlist is:" + ll.llsize());
    //     // System.out.println(ll.removefirst());
    //     // ll.addmiddle(12, 10);
    //     ll.addFirst(2);
    //     ll.printll();
    //     System.out.println(ll.removefirst());
    //     ll.addFirst(1);
    //     ll.printll();
    //     ll.addLast(3);
    //     ll.printll();
    //     ll.addLast(4);
    //     ll.printll();
    //     System.out.println(ll.removelast());
    //     ll.addmiddle(5, 2);
    //     ll.printll();
    //     System.out.println("The item found at:" + ll.iteSearch(5));
    //     System.out.println("The item found at:" + ll.recSearch(5,head));
    //     ll.itrreverse();
    //     ll.printll();
    //     ll.deleteend(2);
    //     ll.printll();
    //     System.out.println(ll.removefirst());
    //     ll.printll();
    //     System.out.println("The item found at:" + ll.iteSearch(1));
    //     System.out.println("The item found at:" + ll.recSearch(1, head));
    //     System.out.println("The size of the linkedlist is:" + ll.llsize());
    // }
    // public static void main(String args[]){
    //     /*when you make object in class linkedlist like:LinkedList ll=new LinkedList();
    //    i. when we call a method through ll.methode_name.then the method type is not nessecery that this method is static type
    //    ii. but when you do not make a object in class then the method is always static type*/
    //     head=new Node(1);
    //     head.next=new Node(2);
    //     head.next.next=new Node(3);
    //     head.next.next.next=head.next;
    //    // head.next.next.next=head;
    //     System.out.println(iscycle());
    //     removecycle();
    //     System.out.println(iscycle());

    // }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printll();
        ll.head=ll.merge_sort(head);
        ll.printll();
        ll.zigzag();
        ll.printll();
    }
}
