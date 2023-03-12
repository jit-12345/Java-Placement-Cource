import java.util.*;
public class HashMapcode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int size;//n- size of linked list
        private LinkedList<Node> buckets[];//N - size of Array or buckets,Buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size=0;
            this.buckets=new LinkekedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i]=new LinkedList<>();

            }

        }
        public void put
    }
}
