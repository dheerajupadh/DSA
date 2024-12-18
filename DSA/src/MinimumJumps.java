public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {2,3,0,1,4};
        int jumps =0;
        int far = 0;

        int currentEnd = 0;
        for(int i=0;i<arr.length;i++){
            far = Math.max(far,arr[i] + i);
            if(i==currentEnd){
                currentEnd = far;
                jumps++;
                if(currentEnd >=arr.length-1){
                    break;
                }
            }
        }
        System.out.println(jumps);
    }
}
