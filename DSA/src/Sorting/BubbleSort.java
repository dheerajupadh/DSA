package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={9,8,7,4,23,44};
        int n = arr.length;
        int temp =0;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        for(int a: arr){
            System.out.println(a);
        }
    }
}
