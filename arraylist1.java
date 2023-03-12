import java.util.ArrayList;
public class arraylist1 {
   public static void main(String[] args) {
    //classname objectname=new classname();
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    //to get the value at index
    System.out.println(list.get(3));
    //to remove a value from a index
   //  list.remove(1);
   //  System.out.println(list);
   //set element at index
   list.set(0,50);
   System.out.println(list);
   System.out.println(list.contains(50));
   //size of arraylist size
   System.out.println(list.size());

   //for iteration of loop
   for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
   }



   } 
}
