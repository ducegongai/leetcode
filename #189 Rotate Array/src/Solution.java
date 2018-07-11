class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length>1){
            reverse(nums,0,nums.length-k-1);
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-1);

        }

}
    public void reverse(int[] nums,int left,int right){
        int i =left,j = right;
        int temp = 0;
        while(i<j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
    }
}