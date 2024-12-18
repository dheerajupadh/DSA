package Revision.test1;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        int start = 0;
        int end  =0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){

                left--;
                right++;
            }
            if(max < right-left-1){
                start = left+1;
                end = right;
                max = right-left-1;
            }
            left = i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){


                left--;
                right++;
            }
            if(max < right-left-1){
                max = right-left-1;
                start = left+1;
                end = right;
            }

        }
        System.out.println( s.substring(start,end));
    }
}
