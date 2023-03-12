import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Greedy_job_sequencing_problem {
    public static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            profit=p;
            deadline=d;
        }
    }
   public static void main(String[] args) {
    int jobsinfo[][]={{4,20},{1,10},{1,40},{1,30}};
    ArrayList<Job> jobs=new ArrayList<>();
    for (int i = 0; i < jobsinfo.length; i++) {
        jobs.add(new Job(i,jobsinfo[i][0],jobsinfo[i][1]));
    }
    //Collection.sort(jobs,(obj1,obj2)->obj1.profit-obj2.profit);//accending order sorting
    Collections.sort(jobs , (obj1,obj2)->obj2.profit-obj1.profit);//decending oreder sorting
    ArrayList<Integer> seq=new ArrayList<>();
    int time=0;
    for(int i=0;i<jobs.size();i++){
        Job curr=jobs.get(i);
        if(curr.deadline>time){
            seq.add(curr.id);
            time++;
        }
    }
    System.out.println("Maximum job = "+seq.size());
    for (int j = 0; j <seq.size(); j++) {
        System.out.print(seq.get(j)+" ");
    }

   } 
}
