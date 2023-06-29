public class spiral_matrix {
    public static void printSpiral(int arr[][]) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            // right
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            // bottom
            for (int i = colEnd - 1; i >= colStart; i--) {
                if(rowStart==rowEnd){
                    break;
                }
                System.out.print(arr[rowEnd][i] + " ");
            }
            // left
            for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
                if(colStart==colEnd){
                    break;
                }              
                System.out.print(arr[i][colStart] + " ");
            }

            rowEnd--;
            colEnd--;
            rowStart++;
            colStart++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 17 },
                        { 5, 6, 7, 8, 18 },
                        { 9, 10, 11, 12, 19 },
                        { 13, 14, 15, 16, 20 },
                        { 22, 23, 24, 25, 21 } };
        printSpiral(arr);
    }
}
