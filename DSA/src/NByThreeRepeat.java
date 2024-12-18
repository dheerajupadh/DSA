public class NByThreeRepeat {
    public static void main(String[] args) {
        int[] A = {59,1000727,1000727,1000641,1000517,1000212,1000532,1000727,1001000,1000254,1000106,
                1000405,1000100,1000736,1000727,1000727,1000787,1000105,1000713,1000727,1000333,1000069
                ,1000727,1000877,1000222,1000727,1000505,1000641,1000533,1000727,1000727,1000727,1000508
                ,1000475,1000727,1000573,1000727,1000618,1000727,1000309,1000486,1000792,1000727,1000727,
                1000426,1000547,1000727,1000972,1000575,1000303,1000727,1000533,1000669,1000489,1000727,1000329,1000727,1000050,1000209,1000109
        };

        int firstNum = 0;
        int secondNum = 0;
        int firstCount = 0;
        int secoundCount =0;
        for(int i=0;i<A.length;i++){
            if(firstNum == 0|| firstNum == A[i]){

                firstNum = A[i];
                firstCount++;
            }else if(secondNum == 0||secondNum == A[i]){
                secondNum = A[i];
                secoundCount++;
            }else{
                if(firstCount>1){
                    firstCount--;
                }else{
                    firstCount = 0;
                    firstNum = 0;
                }
                if(secoundCount>1){
                    secoundCount--;
                }else{
                    secoundCount = 0;
                    secondNum = 0;
                }
                // firstNum = 0;
                // secondNum = 0;
                // firstCount = 0;
                // secoundCount = 0;
            }
        }
        firstCount =0;
        secoundCount = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == firstNum)
                firstCount++;
            if(A[i] == secondNum)
                secoundCount++;
        }
        if(firstCount>A.length/3){
            System.out.println(firstNum);
        }else if(secoundCount>A.length/3){
            System.out.println(secondNum);
        }else{
            System.out.println(-1);
        }
    }
}
