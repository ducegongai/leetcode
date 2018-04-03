public class Solution {



    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = array[left];
            int low = left;
            int high = right;
            while (low < high) {
                while (low < high && array[high] >= pivot) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] <= pivot) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = pivot;
            quickSort(array, left, low - 1);
            quickSort(array, low + 1, right);
        }
    }

    public int arrayPairsum(int[] nums){
        int n = nums.length;
        int res = 0;
        quickSort(nums,0,n-1);
        for(int i=0;i<n;i=i+2){
            res = res + nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int nums[] = {1, 4, 3, 2};
        Solution solution = new Solution();
        int sum = solution.arrayPairsum(nums);
        System.out.println(sum);
    }
}
