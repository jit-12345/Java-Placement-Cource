import java.util.*;
public class arraylistquestion1 {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            list.add(1*i);
            list2.add(3*i);
            list1.add(2*i);
        }
        
        mainList.add(list);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentlist=mainList.get(i);
            for (int j = 0; j <currentlist.size() ; j++) {
               System.out.print(currentlist.get(j)+" "); 
            }
            System.out.println();
        }
    }
}
