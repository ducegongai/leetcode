public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(count>max)
                max = count;
            if(nums[i] ==0){
                count = 0;
            }
            else
                count++;
            if(count>max)
                max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution solution = new Solution();
        int max = solution.findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }
}