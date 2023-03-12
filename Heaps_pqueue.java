import java.util.*;

public class Heaps_pqueue {
    static class Student implements Comparable<Student> { //overriding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);
        // pq.add(7);
        // pq.add(2);
        // pq.add(5);
        // pq.add(1);
        
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }
       

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));
        pq.add(new Student("C", 2));
        pq.add(new Student("E", 1));
        pq.add(new Student("J", 8));
        pq.add(new Student("B", 12));
        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}
