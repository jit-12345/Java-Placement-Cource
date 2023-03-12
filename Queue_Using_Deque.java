import java.util.Deque;
import java.util.LinkedList;

import java.util.*;
public class Queue_Using_Deque {
    public static void main(String[] args) {
    Deque<Integer>deque=new LinkedList<>();
    deque.addFirst(1);
    deque.addFirst(2);
    deque.addLast(3);
    deque.addLast(4);
    System.out.println(deque);
    }
}
