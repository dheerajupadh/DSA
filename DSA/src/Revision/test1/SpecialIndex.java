package Revision.test1;

public class SpecialIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int[] evenSum = new int[arr.length];
        int[] oddSum = new int[arr.length];
        evenSum[0] = arr[0];
        oddSum[0] = 0;
        int count =0;
        for(int i=1;i<arr.length;i++){
            if(i%2 == 0) {
                evenSum[i] = evenSum[i - 1] + arr[i];
                oddSum[i] = oddSum[i - 1];
            }else {
                evenSum[i] = evenSum[i-1];
                oddSum[i] = oddSum[i-1] + arr[i];
            }
        }
        int esum =0;
        int osum = 0;
        for (int i=0;i< arr.length;i++){
            if(i==0){
                esum = oddSum[arr.length-1];
                osum = evenSum[arr.length-1] - evenSum[0];
            }
            else if(i == arr.length-1){
                esum = evenSum[arr.length-2];
                osum = oddSum[arr.length-2];
            }else{
                esum = evenSum[i-1] +( oddSum[arr.length-1] - oddSum[i]);
                osum = oddSum[i-1] + (evenSum[arr.length-1] - evenSum[i]);
            }
            if(esum == osum){
                count++;
            }

        }
        System.out.println(count);
    }
}
