import java.util.*;
public class Greedy_indian_cuurency {
    public static void main(String[] args) {
        //to sort the array in decending order always use Integer class
        Integer currency[]={1,2,5,10,20,50,100,200,500,2000};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount ");
        int amount=sc.nextInt();
        ArrayList<Integer>ans=new ArrayList<>();
        //to sort the array in decending order
        Arrays.sort(currency,Comparator.reverseOrder());
        int count=0;
        for (int i = 0; i < currency.length; i++) {
            if(amount>=currency[i]){
                while (amount>=currency[i]) {
                    count++;
                    ans.add(currency[i]);
                    amount -=currency[i];
                }
            }
        }
        System.out.println("Total minimum cuurency used "+ count);
        System.out.println("And the notes/coins are");
        for (int i = 0; i <ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
