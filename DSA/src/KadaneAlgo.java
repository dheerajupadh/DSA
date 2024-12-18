public class KadaneAlgo {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = A[0];
        int max =A[0];
        for(int a=1;a<A.length;a++){
            sum = sum+ A[a];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
