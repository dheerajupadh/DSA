public class MajorityElement {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,4,4,45,6,7,4,5,6,4,4,4,4,};
        int element  = A[0];
        int count =1;

        for(int i=1;i<A.length;i++){
            if(count ==0){
                element = A[i];
                count =1;
            }else if(A[i] == element){
                count++;
            }else{
                count --;
            }

        }
        System.out.println(element);
    }
}
