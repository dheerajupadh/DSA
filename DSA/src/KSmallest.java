import java.util.Arrays;

public class KSmallest {
    public static void main(String[] args) {
        int[] A = {8,16,80,55,32,8,38,40,65,18,15,45,50,38,54,52,23,74,81,42,28,16,66,35,91,36,44,9,85,58,59,49,75,20,87,60,17,11,39,62,20,17,46,26,81,92};
        Arrays.sort(A);
        int count =1;
        for(int i=1;i<A.length;i++){
            if(A[i] != A[i-1]){
                count++;
            }
            if(count ==9){
                System.out.println( A[i]);

            }
        }
    }
}
//[8, 8, 9, 11, 15, 16, 16, 17, 17, 18, 20, 20, 23, 26, 28, 32, 35, 36, 38, 38, 39, 40, 42, 44, 45, 46, 49, 50, 52, 54, 55, 58, 59, 60, 62, 65, 66, 74, 75, 80, 81, 81, 85, 87, 91, 92]