class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // Pointer for nums1
        int j = n - 1;      // Pointer for nums2
        int k = m + n - 1;  // Pointer for final position in nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
         
        }
    }
    }
    public static void main(String[] args){
        int nums1[]={1,5,3};
        int m=nums1.length;
        int nums2[]={4,2,6};
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
}
