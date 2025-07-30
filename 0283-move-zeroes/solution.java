class Solution {
    public void moveZeroes(int[] nums) {
        int N=nums.length;
        int c=0;
        for(int i=0;i<N;i++){
            if(nums[i]!=0){
                 nums[c]=nums[i];
                 c++;
            }
        }
        while(c<N){
            nums[c]=0;
            c++;
        }
        for(int i=0;i<N;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
