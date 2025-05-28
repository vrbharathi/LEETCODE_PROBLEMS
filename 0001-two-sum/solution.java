import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+","+j);
                    return new int[] {i, j};
                }
            }
        }
      return new int[] {};  
    }
        public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int[] nums=new int[n];
         int target=s.nextInt();
         Solution sl=new Solution();
         sl.twoSum(nums,target);
        }
    }

