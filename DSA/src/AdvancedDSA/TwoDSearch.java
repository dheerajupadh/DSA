package AdvancedDSA;

public class TwoDSearch {

    public static void main(String[] args) {

        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int B=2;

        int i = 0;
        int j =A[0].length-1;
        int sum = 0;
        while(j>=0 && i<A.length){
            if(B == A[i][j]){
                System.out.print( i + " " + j);
                sum+= (i*1009 + j);
                i++;
            }
            else if(A[i][j]>B){
                j--;
            }else if(A[i][j]<B){
                i++;
            }
        }
        System.out.println(sum);
    }
}
