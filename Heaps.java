import java.util.ArrayList;

public class Heaps {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){//O(log n)
            arr.add(data);

            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(par)>arr.get(x)){
                int temp=arr.get(par);
                arr.set(par,arr.get(x));
                arr.set(x,temp);

                //iteration
                x=par;
                par=(x-1)/2;
            }

        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if (left<arr.size() && arr.get(left)<arr.get(minidx)) {
               minidx=left; 
            }
            if (right<arr.size() && arr.get(right)<arr.get(minidx)) {
                minidx=right; 
             }
             if (minidx!=i) {
               int temp=arr.get(i);
               arr.set(i,arr.get(minidx));
               arr.set(minidx,temp);
               
               heapify(minidx);
             }
           
        }

        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            //swap the value with the last index
            int data=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, data);

            //delete the last index value
            arr.remove(arr.size()-1);
            
            //heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h =new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
