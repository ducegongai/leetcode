import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        if(nums.length==0||nums.length==1)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
                System.out.println(i+" added");
            }
            else{
                if(i-map.get(nums[i])<=k){
                    System.out.println(i+"is the right answer");
                    return true;
                }

                map.put(nums[i],i);
            }
            for (Integer a : map.values()
                 ) {
                System.out.print(a);
            }
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        Solution solution = new Solution();
        boolean res = solution.containsNearbyDuplicate(nums,k);
        System.out.println(res);
    }
}