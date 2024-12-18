package Revision.test1;

public class AntiDiagnals {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3,4},
                {4, 5, 6,6},
                {7,8,9,9},
        };
        int n = arr.length;
        int m = arr[0].length;
        int[][] res = new int[n+m-1][n];
        int colStart = m-1;
        int rowStart =0;
        int k = 0;
        while(k<m-1){
            colStart = k;

            rowStart=0;
            while(colStart>=0 && rowStart<n){
                res[k][rowStart] = arr[rowStart][colStart];
                rowStart++;
                colStart--;
            }
            k++;
        }
        int row =1;
        while(row < n){
            colStart = m-1;
            rowStart = row;
            int i=0;
            while(colStart>=0 && rowStart<n){

                res[k][i++] = arr[rowStart][colStart];
                rowStart++;
                colStart--;
            }
            row++;
        }
    }
}
