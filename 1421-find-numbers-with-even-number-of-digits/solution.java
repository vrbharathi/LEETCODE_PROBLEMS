class Solution {
    public static int findNumbers(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n=nums[i];
            while(n!=0){
                count++;
                n/=10;
            }
            if(count%2==0){
                max=max+1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int nums[]={555,901,482,1771};
        findNumbers(nums);
    }
}
