class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == val)
                count++;
        }

        int m = 0,n = 0;
        while(m<nums.length){
            if(m == nums.length-count)
                break;
            if(nums[m] == val){
                for(n = m;n<nums.length-1;n++){
                    nums[n] = nums[n+1];
                }
            }
            else
                m++;
        }

        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }                                       //测试补零前 数组前移情况
        System.out.println();


        for(int j =nums.length-1;j>nums.length-count-1;j--){
            nums[j] = val;
        }
        return nums.length-count;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        Solution solution = new Solution();
        int count = solution.removeElement(nums,3);
        System.out.println(count);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }

}