package Revision.test1;

public class BuySell {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 4};
        int n = arr.length;
        int buy = arr[0];
        int sell = arr[0];
        int max = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > sell){
                sell = arr[i];
                max =  Math.max(max,sell-buy);
            }else if(arr[i] < buy){
                buy = sell;
                sell = 0;
            }
        }
        System.out.println(max);
    }
}
