public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        //{1,1,2,2,3,3,4,4}
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start +end)/2;
            if(nums[mid] !=nums[mid-1] && nums[mid] != nums[mid+1]){
                System.out.println(nums[mid]);
            }
            if((mid -start)%2 == 0){
                if(nums[mid] == nums[mid-1]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        System.out.println(nums[start]);System.out.println(nums[start]);
        System.out.println('A');
    }
}
