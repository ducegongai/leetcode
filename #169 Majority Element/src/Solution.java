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
        int res = 0,max = 0;
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],(int)map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Object value : map.values()){
            System.out.print("Value = "+value+" ");
        } //map遍历

        for (int i = 0; i < nums.length; i++) {
            if(max<(int)map.get(nums[i])){
                max = (int)map.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }

}