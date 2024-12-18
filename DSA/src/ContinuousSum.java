public class ContinuousSum {
    public static void main(String[] args) {


        int A = 10;
        int[][] B = {
                {1, 2, 10},
                {2, 3, 20},
                {3, 5, 15},
                {2, 9, 50},
                {1, 3, 2},
                {3, 4, 5}
        };
        int[] arr = new int[A];
        for (int i = 0; i < B.length;i++){
            arr[B[i][0]-1] += B[i][2];
            arr[B[i][1]-1] -= B[i][2];
        }
        for(int i=1;i<A;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
