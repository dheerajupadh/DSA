public class Flip {
    public static void main(String[] args) {
        String A = "111";
        int count  =0;
        int max =0;
        int[] res = new int[2];
        int initial = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '1'){
                count += 1;
            }else{
                count -= 1;
            }
            if(count<0){
                count =0;
                initial = i+1;
            }
            if(count > max){
                max = count;
                res[0] = initial;
                res[1] = i;

            }

        }
        res = calcuate(res,A);
        if(res.length>0)
        System.out.print(res[0] + " " + res[1]);

    }

    public static int[] calcuate(int[] res,String A ){
        if(res[0] == 0 && res[1] == A.length()-1){
            return new int[0];
        }else {
            return res;
        }
    }
}
