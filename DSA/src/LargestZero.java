//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LargestZero {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,13,1,2,3,4,5,6};
//        [1,2,3,4,5,6,1,2,3,4,5,6];
//        [1,3,5,1,3,5]
//        [2,4,6,2,4,6]
        int[] oddSum = new int[A.length];
        int[] evenSum = new int[A.length];
        int count=0;
        oddSum[0] = 0;
        evenSum[0] = A[0];
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                evenSum[i] = evenSum[i-1] + A[i];
                oddSum[i] = oddSum[i-1];
            }else{
                evenSum[i] = evenSum[i-1];
                oddSum[i] = oddSum[i-1] + A[i];
            }
        }
        int oddS=0;
        int evenS =0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                oddS = evenSum[A.length-1] - evenSum[i];
                evenS = oddSum[A.length-1] - oddSum[i];
            }
            else{
                oddS = oddSum[i-1] + evenSum[A.length-1] - evenSum[i];
                evenS = evenSum[i-1] + oddSum[A.length-1] - oddSum[i];
            }
            if(oddS == evenS){
                System.out.println(oddS);
                System.out.println(evenS);
                System.out.println(A[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}