class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double  max_average = Integer.MIN_VALUE,sum = 0;
        double temp = 0;
        int i = 0,j = k-1,n = nums.length;
        if(nums.length==1)
            return nums[0];

        for (int l = 0; l < k; l++) {
            sum = sum + nums[l];
        }
        max_average = sum/k;

        while(j+1<n){
            sum = sum - nums[i] + nums[j+1];
            temp = sum/(double)k;
            if(temp > max_average)
                max_average = temp;

            i++;
            j++;
        }
        return max_average;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,3,3};
        int k=4;
        Solution solution  = new Solution();
        double res = solution.findMaxAverage(nums,k);
        System.out.println(res);

    }
}