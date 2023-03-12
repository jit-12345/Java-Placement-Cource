import java.util.*;
public class multidimensionalarraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> newList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(9);
        newList.add(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(5);
        newList.add(list2);
        System.out.println(newList);
        //to print the element of the mainlist
        for (int i = 0; i < newList.size(); i++) {
            ArrayList<Integer>currentlist=newList.get(i);
            for (int j = 0; j < currentlist.size(); j++) {
               System.out.print(currentlist.get(j)+" "); 
            }
            System.out.println();
        }
    }
    
}
