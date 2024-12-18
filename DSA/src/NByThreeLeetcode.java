import java.util.ArrayList;
import java.util.List;

public class NByThreeLeetcode {
    public static void main(String[] args) {

    int[] nums = {2,1,1,3,1,4,5,6};


        int firstNum = 0;

        int secondNum = 0;

        int firstCount = 0;

        int secoundCount =0;

        for(int i=0;i<nums.length;i++){

            if(firstNum == 0|| firstNum == nums[i]){



                firstNum = nums[i];

                firstCount++;

            }else if(secondNum == 0||secondNum == nums[i]){

                secondNum = nums[i];

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

        for(int i=0;i<nums.length;i++){

            if(nums[i] == firstNum)

                firstCount++;

            if(nums[i] == secondNum && firstNum != secondNum)

                secoundCount++;

        }
        List<Integer> res = new ArrayList<>();

        if(firstCount>nums.length/3){

            res.add(firstNum);

        }
        if(secoundCount>nums.length/3){

            res.add(secondNum);

        }
    }
}
