import java.util.Arrays;
import java.util.Comparator;

public class Greedy_fractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        int totvalue=0;
        int capacity=w;
        //the ration array is long because the price of per kg item may be fractional
        double ratio[][]=new double[value.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //ascending order sort of ratio
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        
        for (int i = ratio.length-1; i >=0; i--) {
            int idx=(int)ratio[i][0];
            if (capacity>=weight[idx]) {
                totvalue+=value[idx];
                capacity-=weight[idx];
            }
            //include fractional item
            totvalue=(int)ratio[i][1]*capacity;
            break;
        }
        System.out.println("The maximum profit "+totvalue);
    }
}
