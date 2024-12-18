import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String A = "aaaabaaaa";
//        int diff = 1;
//        for(int i=0;i<A.length();i++){
//            // Calaulate palindrome for odd length
//            int left = i-1;
//            int right = i+1;
//            while(left>=0 && right <A.length() && A.charAt(left) == A.charAt(right)){
//                left--;
//                right++;
//            }
//            diff = Math.max(diff,right-left-1);
//            //Calculate palindome for even length
//            left = i;
//            right = i+1;
//            while(left>=0 && right <A.length() && A.charAt(left) == A.charAt(right)){
//                left--;
//                right++;
//            }
//            diff = Math.max(diff,right-left-1);
//        }
//        System.out.println(diff);

        int diff = 1;
        int start = 0;
        int end  =1;
        for(int i=0;i<A.length();i++){
            // Calaulate palindrome for odd length
            int left = i-1;
            int right = i+1;
            while(left>=0 && right <A.length() && A.charAt(left) == A.charAt(right)){
                left--;
                right++;
            }
            if(diff < right-left-1){
                diff = right - left-1;
                start = left+1;
                end = right-1;
            }
            //Calculate palindome for even length
            left = i;
            right = i+1;
            while(left>=0 && right <A.length() && A.charAt(left) == A.charAt(right)){
                left--;
                right++;
            }
            if(diff < right-left-1){
                diff = right - left-1;
                start = left+1;
                end = right-1;
            }
        }
        System.out.println( A.substring(start,end));

    }
}
