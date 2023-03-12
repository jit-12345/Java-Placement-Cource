import javax.swing.plaf.synth.SynthStyleFactory;

public class recursion_increment{
    public static void increment(int n){
        
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
            increment(n-1);
            System.out.print(n+" ");
            
        
    }
    public static void main(String[] args) {
        int n=10;
        increment(n);
    }
}