public class Selection_sort {
    
        public static void selectionsort(int arr[]){
            for (int turns = 0; turns < arr.length-1; turns++) {
                int minpos=turns;
                for (int j = turns+1; j < arr.length; j++) {
                    if (arr[minpos]>arr[j]) 
                    {
                        minpos=j;
                    }
                }
                int temp=arr[minpos];
                arr[minpos]=arr[turns];
                arr[turns]=temp;
               
            }
            printarr(arr);
        }
        public static void printarr(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
           int arr[]={5,3,2,4,1}; 
           selectionsort(arr);
        }
    }
    

