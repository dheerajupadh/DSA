public class AntiDiagnolsRect {

        public static void main(String[] args) {
            int[][] arr= {
                    {1, 2, 3,4},
                    {4, 5, 6,6},
                    {7,8,9,9},
            };
            int n = arr.length;
            int m = arr[0].length;
            int k=0;
            int rowStart =0;
            int colStart = 0;
            int[][] res = new int[n+m-1][n];
            while(k<=m-1){
                rowStart = 0;
                colStart = k;
                while(rowStart<n && colStart >= 0){
                    res[k][rowStart] = arr[rowStart][colStart];
                    rowStart++;
                    colStart--;
                }

                k++;
            }

            while(k<(n+m-1)){

                rowStart = k-m+1;
                colStart = m-1;
                while(rowStart<n && colStart>=0){
                    res[k][m-colStart-1] = arr[rowStart][colStart];
                    rowStart++;
                    colStart--;
                }
                k++;
            }
            for(int i=0;i<k;i++){
                for(int j=0;j<res[i].length;j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

