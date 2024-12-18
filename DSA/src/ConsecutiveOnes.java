public class ConsecutiveOnes {
    public static void main(String[] args) {
        String A = "11010110000000000";
        int ones = 0;
        for(int i =0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                ones++;
            }
        }

        int max = 0;
        int leftCount = 0;
        int rightCount=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '0'){
                leftCount = 0;
                rightCount = 0;
                int rightIndex = i+1;
                int leftIndex = i-1;
                while(rightIndex <A.length()){
                    if(A.charAt(rightIndex) == '1'){
                        rightCount++;
                        rightIndex++;
                    }else{
                        break;
                    }
                }
                while(leftIndex >=0){
                    if(A.charAt(leftIndex) == '1'){
                        leftCount++;
                        leftIndex--;
                    }else{
                        break;
                    }
                }
                if(leftCount + rightCount < ones){
                    max = Math.max(max,leftCount+rightCount + 1);
                }else
                    max = Math.max(max,leftCount + rightCount);
            }

        }
        System.out.println(max);

    }
}
