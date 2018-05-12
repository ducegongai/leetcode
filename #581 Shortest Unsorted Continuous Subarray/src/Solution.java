class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        if(nums.length==1||nums.length==0)
            return 0;


        for (int i = 0; i < nums.length; i++) {
            boolean flg = false;
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[j]<nums[i]){
                    flg = true;
                    break;
                }
            }
            if(flg == false){
                length--;
            }else
                break;
        }


        if(length==0){
            return 0;
        }
        for (int k = nums.length-1; k >=0 ; k--) {
            boolean flg = false;
            for (int l = k-1; l >=0 ; l--) {
                if(nums[l]>nums[k]){
                    flg = true;
                    break;
                }
            }
            if(flg == false){
                length--;
            }
            else{
                break;
            }
        }
        return length;
    }
}