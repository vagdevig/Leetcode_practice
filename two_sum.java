# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.

# You can return the answer in any order.



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i=0;
        while(i < nums.length){
            int check = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(check == nums[j]){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
            i++;
        }
        return ans;
    }
}
