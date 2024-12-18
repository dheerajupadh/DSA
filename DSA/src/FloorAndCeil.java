public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr ={3, 4, 7, 8, 8, 10};
        int n =6;
        int x = 7;
        int ceil = 100000;
        int floor = -10000;
        for(int i=0;i<n;i++){
            if(arr[i] >=x && arr[i] < ceil){
                ceil = arr[i];
            }
            if(arr[i]<=x && arr[i] > floor){
                floor = arr[i];
            }

        }
        System.out.println(ceil + " " + floor);
        String s  = String.valueOf('a' +'b');
    }
}

