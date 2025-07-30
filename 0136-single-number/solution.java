class Solution {
    public int singleNumber(int[] nums) {
        int N=nums.length;
        int res=0;
        if(nums.length==1)
           return nums[0];
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
            if(nums[i]==nums[j]){
                nums[i]=0;
                nums[j]=0;
            }
        }
        }
        for(int i=0;i<N;i++){
            if(nums[i]!=0)
               res=nums[i];
        }
        return res;
    }
}
