import java.util.Scanner;

import java.util.*;
public class matrix_min_max {
    public static void findMinMax(int arr[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max=Math.max(arr[i][j], max);
                min=Math.min(arr[i][j],min);
            }
        }
        System.out.println("The maximum and minimum value of the matrix is "+min+","+max);
    }
   public static void main(String[] args) {
    int arr[][]=new int [3][3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        for (int j = 0; j < arr[0].length; j++) {
            arr[i][j]=sc.nextInt();
        }
    }
    findMinMax(arr);
   } 
}
