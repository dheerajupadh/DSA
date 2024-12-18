public class ClosestSum {
    public static void main(String[] args) {
        int[] C = {10,5,2};
        int A = 3;
        int B = 25;
        for(int i=1;i<A;i++){
            C[i] = C[i-1] + C[i];
        }
        int sum = C[0];
        int ret = 0;
        for(int i=0;i<A;i++) {
            for (int j = i; j < A; j++) {
                if (i == 0) {
                    sum = C[j];
                } else {
                    sum = C[j] - C[i - 1];
                }
                if (sum == B) {
                    System.out.println(B);
                } else if (sum > ret && sum < B) {
                    ret = sum;
                }
            }
        }
        System.out.println(ret);
    }
}
