class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int min = prices[0],max = prices[0],prof = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]>=max)
                max = prices[i];
            if(prices[i]<=min){
                min = prices[i];
                max = prices[i];
            }

            if(max-min >prof)
                prof = max - min ;

        }
        return prof;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        int res = solution.maxProfit(prices);
        System.out.println(res);
    }
}