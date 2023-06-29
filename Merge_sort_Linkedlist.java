//get mid fun...
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is my middle node...
    }


    //merge function...
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);  //dummy linlist node.which i initilized with -1.
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        
        //For reamining node data..
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    //mergesort function..

    public Node mergeSort(Node head) {

        //base case ..
        if (head == null || head.next == null) {
            return head;
        }

        //step 1: Find out the middle node of linklist..
        Node mid = getMid(head);

        
        Node rightHead = mid.next; //middle next will be my right sub-linklist head..
        mid.next = null;
        Node newLeft = mergeSort(head); //this is for left sub - ll..
        Node newRight = mergeSort(rightHead); //this is for right sub - ll..

        // merge two ll..
        return merge(newLeft, newRight);
    }
