class Solution {
    public int maxSubArray(int[] nums) {
        int c_sum=nums[0];
		int f_sum=nums[0];
        if(c_sum<0)
        c_sum=0;
        if(nums.length==1)
        return nums[0];
		for(int i=1;i<nums.length;i++) {
			c_sum+=nums[i];
			f_sum=Math.max(c_sum,f_sum);
            if(c_sum<0)
                c_sum=0;
		}
		return f_sum;
    }
}
