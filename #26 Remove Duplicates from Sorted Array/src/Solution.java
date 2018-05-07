class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0,count = 1;
        int k = 1;
        if(nums.length == 0)
            return 0;
        temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != temp)
                count++;
            temp = nums[i];
        }
        temp = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != temp){
                nums[k] = nums[j];
                k++;
            }
            if(k==count)
                break;
            temp = nums[j];
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {};
        Solution soluton = new Solution();
        int res = soluton.removeDuplicates(nums);
        System.out.println(res);
    }
}