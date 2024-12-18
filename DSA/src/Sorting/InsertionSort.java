package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={9,8,7,4,23,44};
        int n = arr.length;
        int temp =0;
        for(int i=1;i<n;i++){
            int j = i-1;
            temp = arr[i];
            while(j>=0 && arr[j] > temp ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int a: arr){
            System.out.println(a);
        }
    }
}
