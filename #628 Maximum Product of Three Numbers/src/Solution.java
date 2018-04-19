import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        int res;
        Arrays.sort(nums);
        if(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]>nums[0]*nums[1]*nums[nums.length-1])
            res = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        else
            res = nums[0]*nums[1]*nums[nums.length-1];
        return res;
    }
}