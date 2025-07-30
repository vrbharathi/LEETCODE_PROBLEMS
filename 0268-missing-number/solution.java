class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
        int total=(N*(N+1))/2;
        int sum=0;
        for(int i=0;i<N;i++){
            sum += nums[i];
        }
        return total-sum;
    }
}
