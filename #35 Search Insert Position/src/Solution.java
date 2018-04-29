class Solution {
    public int searchInsert(int[] nums, int target) {
        int n  = nums.length;
        int low = 0 ,high = nums.length-1;
        if(nums.length==1){
            if(nums[0]>target)
                return 0;
            else if(nums[0]<target)
                return 1;
            else
                return 0;
        }
        if(nums[0]>target)
            return 0;
        if(nums[nums.length-1]<target)
            return nums.length;
        while(low < high){
            if(nums[(high+low)/2] > target){
                high = (high+low)/2 ;
            }
            else if(nums[(high+low)/2] < target){
                low = (high+low)/2+1;
            }
            else
                return (high+low)/2;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        Solution solution = new Solution();
        int res = solution.searchInsert(nums,2);
        System.out.println(res);
    }
}
