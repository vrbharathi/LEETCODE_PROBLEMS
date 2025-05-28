import java.util.*;
class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    int[] merged = new int[n1 + n2];

    for (int i = 0; i < n1; i++) {
        merged[i] = nums1[i];
    }
    for (int i = 0; i < n2; i++) {
        merged[n1 + i] = nums2[i];
    }

    Arrays.sort(merged);

    int total = n1 + n2;
    if (total % 2 == 0) {
        return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
    } else {
        return merged[total / 2];
    }
}
public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int n2=s.nextInt();
    int [] nums1=new int[n1];
    int [] nums2=new int[n2];
    Solution sl=new Solution();
    sl.findMedianSortedArrays(nums1,nums2);
}
   }

