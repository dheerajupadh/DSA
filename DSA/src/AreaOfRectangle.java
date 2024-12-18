public class AreaOfRectangle {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5,7,39,11,3},
                {7,4,6,8,2,3},
                {1,8,9,3,0,2},
                {6,3,7,4,1,0},
                {2,6,8,4,5,1},
                {8,4,6,0,9,2}
        };
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=1;j<arr[i].length;j++){
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }

        }
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=1;j<arr[i].length;j++){
                arr[j][i] = arr[j-1][i] + arr[j][i];
            }

        }
        int[][][] q= {
                {{0,0},
                {4,4}},
                {{1,2},
                {3,4}},
                {{1,1},
                 {1,3}},

        };
        for(int i=0;i<q.length;i++){
            int a1 = q[i][0][0];
            int a2 = q[i][0][1];
            int b1 = q[i][1][0];
            int b2 = q[i][1][1];
            int sum = arr[b1][b2];
            if(a1 >0){
                sum -= arr[a1-1][b2];

            }
            if(a2>0){
                sum -= arr[b1][a2-1];
            }
            if(a2>0 && a1>0){
                sum += arr[a1-1][a2-1];
            }
            System.out.println(sum + " ");
        }

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");

        }


    }
}
