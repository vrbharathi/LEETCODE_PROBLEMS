class Solution {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
            }
        for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
      return nums;
    }
    public static void main(String[] args){
        int[] nums={-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
