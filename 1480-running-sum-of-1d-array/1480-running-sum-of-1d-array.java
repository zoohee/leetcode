class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i = 1; i<nums.length; i++) {
            sums[i] = sums[i-1]+ nums[i];
        }
        return sums;
    }
}