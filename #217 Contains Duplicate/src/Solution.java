import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map exit = new HashMap();
        /*if(nums.length == 0||nums.length == 1)
            return false;*/
        for (int i = 0; i < nums.length; i++) {
            if(exit.containsKey(nums[i])){
                return true;
            }

            else
                exit.put(nums[i],nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        Solution solution = new Solution();
        boolean res = solution.containsDuplicate(nums);
        System.out.println(res);
    }
}