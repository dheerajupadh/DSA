public class DivisibleByM {

    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int B = 28;
        int ans  =0;
        int mod = 1000000007;
        long[] rem = new long[B];
        for(int a:A){
            rem[a%B]++;
        }
        ans = (int) (rem[0] * (rem[0]-1)/2);

        for (int i =1,j=rem.length-1;i<=j;i++,j--){
            if(i==j)
            ans = (int) (ans + (rem[i] * rem[j])/2)%mod;
            else
                ans = (int) (ans + (rem[i] * rem[j]))%mod;
        }
        System.out.print(ans);
    }
}
