package Revision.test1;

public class RotateMatrix180 {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7,8,9},
        };

        int start =0;
        int end = arr.length-1;
        int temp =0;
        while(start<end){
            for(int i=0;i<arr.length;i++){
                temp = arr[start][i];
                arr[start][i] = arr[end][i];
                arr[end][i] = temp;
            }
            start++;
            end--;
        }
    }
}
