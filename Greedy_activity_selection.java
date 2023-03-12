import java.util.*;
public class Greedy_activity_selection{
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        //end time basic sorted
        int end[]={6,2,4,7,9,9};
        //if staring index is sort and ending index are not sort
        //make a 2d matrix of 3 column and start.length row
        //the make 0 column as index 1 column as start and 2 column as end;
        //sort the end column
        int activities[][]=new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //sorting of end column
        //lambda function ->sort form
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        System.out.println("Index");
        for (int i = 0; i < activities.length; i++) {
            //index
            System.out.print(activities[i][0]+" ");
            
           
        }
        System.out.println();
        System.out.println("start");
        for (int i = 0; i < activities.length; i++) {
            //start
            System.out.print(activities[i][1]+" ");
            
        }
        System.out.println();
        System.out.println("end");
        for (int i = 0; i < activities.length; i++) {
            //end
            System.out.print(activities[i][2]+" ");
           
        }
        System.out.println();

        ArrayList<Integer>ans=new ArrayList<>();
        int myactivity=0;
        //1st activity
        ans.add(activities[0][0]);
        myactivity++;
        int lastend=activities[0][2];
        for (int i=1;i<activities.length;i++) {
           if (activities[i][1]>=lastend) {
            myactivity++;
            ans.add(activities[i][0]);
            lastend=activities[i][2];
           } 
        }
        System.out.println("The total activity is "+myactivity);
        System.out.print("The activities are ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}