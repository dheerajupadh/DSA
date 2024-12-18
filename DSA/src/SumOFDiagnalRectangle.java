public class SumOFDiagnalRectangle {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,3,5},
                {6,7,8,9,0},
                {2,3,4,5,6},
                {3,4,5,6,7}
        };
        int n = arr.length;
        int m = arr[0].length;
        int[][] res = new int[n+m-1][n+1];
        int i=0;
        int j=m-1;
        int rescol=0;
        int resrow =0;
        while(j>=0){
            int row =0;
            int col = j;
            while(row<n && col >=0){
                res[resrow][rescol] = arr[row][col];
                rescol++;
                col--;
                row++;
            }
            resrow++;
            rescol=0;
            j--;
        }
        i=1;
        j=m-1;
        while(i<n){
            int row =i;
            int col = j;
            while(row<n && col>=0){
                res[resrow][rescol]= arr[row][col];
                row++;
                col--;
                rescol++;
            }
            resrow++;
            rescol=0;
            i++;
        }
        for(int o=0;o<res.length;o++){
            for(int y=0;y<res[0].length;y++){
                System.out.print(res[o][y] + " ");
            }
            System.out.println();
        }
    }
}
