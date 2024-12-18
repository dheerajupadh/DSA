public class LowestAvgSubArray {
    public static void main(String[] args) {
        int [] A = {4,3,17,3,8,8,14,19,4,10,6,17,19,13,10,12,7,8,17,5};
        float total = 0;
        int B =8;
        for(int i=0;i<B;i++){
            total +=A[i];
        }
        int index =1;
        float avg = total/B;
        int j=B;
        int i=0;
        while(j<A.length){
            total = total + A[j] - A[i];
            if(avg>(float)((total)/B)){
                avg = (float)(total/B);
                index = i+1;
            }
            j++;
            i++;
        }
        System.out.println(index);
    }

}
