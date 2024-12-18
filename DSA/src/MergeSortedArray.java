public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;

        int n = nums2.length;
        int len = m+n;
        if(m==0){
            for(int i=0;i<len;i++){
                nums1[i] = nums2[i];
            }
        }else {
            for (int i = len - 1; i >= 0; i--) {
                if (n > 0 && nums2[n - 1] > nums1[m - 1]) {
                    nums1[i] = nums2[n - 1];
                    n = n - 1;
                } else {
                    nums1[i] = nums1[m - 1];
                    m = m - 1;
                }
            }
        }
        for(int a :nums1)
            System.out.println(a);
    }
}
