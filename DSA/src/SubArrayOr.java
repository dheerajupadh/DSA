public class SubArrayOr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long ans = 0;
        int total = arr.length * (arr.length+1)/2;


        for(int i =0;i<32;i++){
            int zeroCount = 0;
            int zeros = 0;
            for(int j=0;j<arr.length;j++){
                if((arr[j] & (1<<i)) ==0)
                zeroCount++;
                else{
                    zeros += zeroCount * (zeroCount+1)/2;
                    zeroCount = 0;
                }
            }

            zeros += zeroCount * (zeroCount+1)/2;

            int oneCount = total - zeros;
            ans = (ans + ((long) oneCount * (1<<i)))%1000000007;
        }
        System.out.print(ans);
    }

}
