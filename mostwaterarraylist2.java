import java.util.ArrayList;

public class mostwaterarraylist2 {
    public static int mosttrappedwater(ArrayList<Integer>height){
        int lp=0;
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int i = height.size()-1; i >=lp; i--) {
            if(i==lp){
                lp++;
            }
          int boundary=Math.min(height.get(i),height.get(lp));
          int width=i-lp;
          int totalwater = width*boundary;
        //   if (totalwater<0){
        //     totalwater=totalwater*(-1);
        //   }
          if(max<totalwater){
            max=totalwater;
          }
          count++;
        }
        System.out.println(count);
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println("The maximum bounded total water is "+mosttrappedwater(list));
    }
}
