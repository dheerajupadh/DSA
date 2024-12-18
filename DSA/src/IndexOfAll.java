public class IndexOfAll {
    public static void main(String[] args) {
            int[] arr = allIndex(new int[]{1, 2, 3, 4, 5},1,0,0);
            System.out.print(arr[0]);
    }

    public static int[] allIndex(int[] A,int B,int cnt,int i){
        if(i == A.length-1){
            return new int[B];
        }
        if(A[i] == B){

            int[] arr = allIndex(A,B,cnt+1,i+1);
            arr[cnt] = i;
            return arr;

        }else{
            int[] arr = allIndex(A,B,cnt,i+1);
            return arr;
        }
    }
}
