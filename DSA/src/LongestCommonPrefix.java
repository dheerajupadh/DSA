public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A = {"abcd","abce","abcf"};
        String s = A[0];
        int longest =s.length();
        for(int i=1;i<A.length;i++){
            int length1 = s.length();
            int len = A[i].length();
            int j=0;
            while(len>0 && length1>0){

                if(s.charAt(j) == A[i].charAt(j)){
                    j++;
                }
                len--;
                length1--;
            }
            longest = Math.min(longest,j);
            s.contains(s.charAt(i) + "");
        }
        System.out.println(A[0].substring(0,longest));
    }
}
