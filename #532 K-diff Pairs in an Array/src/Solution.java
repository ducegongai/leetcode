import java.util.ArrayList;

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)
            return 0;
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+k==nums[j]&&i!=j&&!nums1.contains(nums[i])){
                        count++;
                        nums1.add(nums[i]);
                }


            }
        }
        return count;
    }
}