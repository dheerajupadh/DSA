public class MinFlips {
    /*
    public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i) == B){
                count++;
            }
        }
        int no = 0;
        for(int i=0;i<count;i++){
            if(B == A.get(i)){
                no++;
            }
        }
        int max = no;
        for(int i=0,j=count;j<A.size();j++,i++){
            if(A.get(i) == B){
                no -= 1;
            }
            if(A.get(j) == B){
                no += 1;
            }
            max = Math.max(max,no);
        }
        return max;
    }

}

     */
}
