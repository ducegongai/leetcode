
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                System.out.println(i+1);
                res.add(i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = new ArrayList<Integer>();
        Solution solution = new Solution();
        res = solution.findDisappearedNumbers(nums);
        //System.out.println(res.toArray());
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }

    }
}