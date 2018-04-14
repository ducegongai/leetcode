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
        return helper(nums,0,nums.length-1);
    }
    public static int helper(int[] nums,int begin,int end){
        if(begin==end)
            return nums[begin];
        if(begin<end){
            int mid = begin + (end-begin)/2;
            int left = helper(nums,begin,mid);
            int right = helper(nums,mid+1,end);
            if(left == right)
                return left;
            else{
                int leftCount = 0;
                int rightCount = 0;
                for (int i = begin; i <= end; i++) {
                    if(nums[i]==left)
                        leftCount++;
                    if(nums[i] == right)
                        rightCount++;
                }
                if(leftCount>rightCount)
                    return left;
                else
                    return right;

            }
        }
        else
            return 0;

    }

}