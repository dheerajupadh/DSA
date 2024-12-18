package Revision.test1;

public class EvenNumbersInaRa {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] b = {
                {0,2},
                {2,4},
                {1,4}
        };
        int[] res = new int[b.length];
        arr[0] = arr[0]%2==0?1:0;
        for(int i=1;i< arr.length;i++){
            arr[i] = arr[i]%2==0?arr[i-1] +1:arr[i-1];
        }
        int index =0;
        for(int i=0;i<b.length;i++){
            index =b[i][0];
            if(index ==0){
                res[i] = arr[b[i][1]];
            }else{
                res[i] = arr[b[i][1]] - arr[index-1];
            }
            System.out.println(res[i]);
        }


    }
}
