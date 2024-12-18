package Sorting;

public class SelectionSort {

    public void swap(int[] a, int[]b){
        int[] temp =a;
        a=b;
        b=a;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4};
        int i= arr.length;

        selectionSort(arr,i);
        for (int k : arr) {
            System.out.print(k);
        }

    }
    static void selectionSort(int[] arr, int n)
    {
        //code here
        int pos =0;
        int temp =0;

        for(int i=0;i<n;i++){
            pos =i;
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
}
