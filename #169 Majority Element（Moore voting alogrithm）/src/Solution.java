import java.util.HashMap;
import java.util.Map;

class Solution {


    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
        Solution solution = new Solution();
        int res = solution.majorityElement(nums);
        System.out.println(res);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(count == 0 || result == nums[i]){
                count++;
                result = nums[i];
            }
            else
                count--;
        }
        return result;
    }


}