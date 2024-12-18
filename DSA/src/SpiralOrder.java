public class SpiralOrder {
    public static void main(String[] args) {

        int A = 5;
        int[][] res = new int[A][A];
        int i=0;
        int j=0;
        int k =1;
        int ind = A-1;
        while(ind>=1){
            for(int x = 0;x<ind;x++){
               res[i][j]=k++;
                j++;
            }
            for(int x = 0;x<ind;x++){
                res[i][j]=k++;
                i++;
            }
            for(int x = 0;x<ind;x++){
                res[i][j]=k++;
                j--;
            }
            for(int x = 0;x<ind;x++){
                res[i][j]=k++;
                i--;
            }
            ind -=2;
            i++;
            j++;
        }
        System.out.print(res[0][3]);
    }
}
