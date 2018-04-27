import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int dominantIndex(int[] nums) {
        HashMap temp = new HashMap();
        for (int i = 0; i < nums.length; i++) {
                temp.put(nums[i],i);
            System.out.println(nums[i]+" "+i);
        }
        Arrays.sort(nums);
        if(nums.length<1)
            return -1;
        if (nums.length==1)
            return 0;
        if(nums[nums.length-1]>=2*nums[nums.length-2])
            return (int)temp.get(nums[nums.length-1]);
        else
            return -1;


    }

    public static void main(String[] args) {
        int[] nums = {0,0,2,3};
        Solution solution = new Solution();
        int res = solution.dominantIndex(nums);
        System.out.println(res);
    }
}