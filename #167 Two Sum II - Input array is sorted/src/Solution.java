class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {0,0};
        for(int index1 =0; index1 < numbers.length;index1++){
            for(int index2 = index1 +1;index2 < numbers.length;index2++){
                if(numbers[index1] + numbers[index2] > target)
                    break;
                if(numbers[index1] + numbers[index2] == target)
                {
                    res[0] = index1 + 1;
                    res[1] = index2 + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] res = solution.twoSum(numbers,9);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

}