import java.util.ArrayList;
public class maximumarraylist {
     public static void main(String args[]){
      ArrayList<Integer>list=new ArrayList<>();
      list.add(4);
      list.add(1);
      list.add(12);
      list.add(5);
      list.add(8);
      int max=Integer.MIN_VALUE;
      for (int i = 0; i < list.size(); i++) {
        // if (max<list.get(i)) {
        //     max=list.get(i);
        // }
        max=Math.max(max,list.get(i));
      }
      System.out.println(max+" is my max element");
    }
}

