import java.util.HashMap;
import java.util.Map;

class Solution {
    public int missingNumber(int[] nums) {
        Map exit = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            exit.put(nums[i],1);
        }
        for (int i = 0; i < nums.length+1; i++) {
            if(!exit.containsKey(i))
                return i;

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Solution solution = new Solution();
        int res = solution.missingNumber(nums);
        System.out.println(res);
    }
}