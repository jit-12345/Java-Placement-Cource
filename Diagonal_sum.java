public class Diagonal_sum {
    public static int calDiagSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(arr.length-1-i != i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
    System.out.println(calDiagSum(arr));
    
    }
}
