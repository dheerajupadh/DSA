package Revision.test1;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 9};
        int n = arr.length;
        int min = 1000000;
        int max = -1000000;
        int minIndex = 0;
        int maxIndex = 0;
        int closest = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < min){
                minIndex = i;
                min = arr[i];
                closest = minIndex - maxIndex;
            }
            if(arr[i] > max){
                maxIndex =i;
                max = arr[i];
                closest = maxIndex - minIndex;
            } else if (arr[i] == max) {
                maxIndex = i;
                closest = Math.max(closest,maxIndex-minIndex);

            } else if (arr[i] == min) {
                minIndex = i;
                closest = Math.max(closest,minIndex-maxIndex);

            }
        }
        System.out.println(closest+1);
    }
}
