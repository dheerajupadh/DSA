package Revision.test1;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] pf = new int[arr.length];
        int[] sf = new int[arr.length];
        int n = arr.length;
        pf[0] = arr[0];
        sf[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--){
            sf[i] = sf[i+1] + arr[i];
        }
        for(int i=1;i<n;i++){
            pf[i] = pf[i-1] + arr[i];

        }
        int leftSum =0;
        int rightSum =0;

        for(int i=0;i<n;i++){
            if(i==0){
                rightSum = sf[1];
                leftSum=0;
            }
            else if(i == n-1){
                leftSum =pf[n-2];
                rightSum = 0;
            }else{
                leftSum = pf[i-1];
                rightSum = sf[i+1];
            }
            if(leftSum == rightSum){
                System.out.println(i);
            }


        }

    }
}
