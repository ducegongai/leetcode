class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean flg = true;
        int temp = 0;
        if(nums.length==0||nums.length==1||nums.length==2)
            return true;
        for (int i = 0; i < nums.length; i++) {
            flg = true;
            temp = nums[i];
            if(i==0)
                nums[i] = nums[i+1]-1;
            if(i== nums.length-1)
                nums[i] = nums[i-1]+1;
            if(i!=0&&i!=nums.length-1)
                nums[i] = (nums[i-1]+nums[i+1])/2;
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j]>nums[j+1])
                    flg = false;
            }
            nums[i] = temp;
            if(flg == true)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        Solution solution = new Solution();
        boolean res  = solution.checkPossibility(nums);
        System.out.println(res);
    }
}