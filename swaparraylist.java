import java.util.ArrayList;
public class swaparraylist {
    public static void swap(ArrayList<Integer>list,int indx1,int indx2){
        int temp=list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
   public static void main(String args[]) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(8);
    list.add(7);
    list.add(3);
    list.add(1);
    list.add(6);
    swap(list,1,3);
    System.out.println(list);

   }
}
