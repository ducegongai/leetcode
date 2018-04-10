/*
* 函数int型 返回count只为测试 提交时改为void
* 思路：找0的个数，遍历，遇到0就把所有元素前移动一位，最后 根据count把数组最后全补0
* 注意的地方：1、本位和下位都是0，前移以后不要遗漏
*            2、如数组往后全是0会死循环，注意如果遍历到lengtn-count处就可以结束了
*
* */


class Solution {
    public int moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == 0)
                count++;
        }

       int m = 0,n = 0;
       while(m<nums.length){
           if(m == nums.length-count)
               break;
           if(nums[m] == 0){
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
            nums[j] = 0;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,0};
        Solution solution = new Solution();
        int count = solution.moveZeroes(nums);
        System.out.println(count);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}