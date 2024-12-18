public class PickFromSides {
    public static void main(String[] args) {


        int[] A = {9,2,3,6,7,8,9};
        int B = 4;
//        for (int i = 1; i < A.length; i++) {
//            A[i] = A[i - 1] + A[i];
//        }
//        int sum = -1000000;
//        int s = 0;
//        B = B%A.length;
//        for (int i = 0; i <= B; i++) {
//            if (i == 0) {
//                sum = Math.max(sum, A[A.length - 1] - A[A.length - B - 1]);
//            } else if (i == B) {
//                sum = Math.max(sum, A[i-1]);
//            } else {
//                s = A[i - 1] + A[A.length - 1] - A[A.length - 1 - (B-i)];
//                sum = Math.max(sum, s);
//            }
//
//        }
//        System.out.println(sum);
        int[] pf = new int[A.length];
        int[] sf = new int[A.length];
        pf[0] = A[0];
        sf[A.length-1] = A[A.length-1];

        for(int i=1;i<A.length;i++){
            pf[i] = pf[i-1] + A[i];
            sf[A.length-1-i] = sf[A.length-i] + A[A.length-1-i];
        }
        int sum=-1000000000;

        for(int i=0;i<=B;i++){
            if(i==0){
                sum = Math.max(sum , pf[B-1]);
            }else if(i==B){
                sum = Math.max(sum,sf[A.length-B]);
            }else{
                sum = Math.max(sum,pf[B-1-i]+ sf[A.length-i]);
            }
        }
        System.out.println(sum);
//        System.out.println(sum);
    }
}
