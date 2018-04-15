import javax.jws.soap.SOAPBinding;

class Solution {
    public static void main(String[] args) {
        int[] prices = {2,1,4};
        Solution solution = new Solution();
        int res = solution.maxProfit(prices);
        System.out.println(res);
    }


    public int maxProfit(int[] prices) {
        int temp = 0;
        int dis_count = 0;
        int begin = 0,end = 0;
        for(begin =0;begin< prices.length;begin++){
            for (end = begin+1; end < prices.length ;end++) {
                if(prices[end]<prices[begin]){
                    begin = end-1;
                    break;
                }
                temp = prices[end]-prices[begin];
                if(temp>0){
                    dis_count = dis_count + temp;
                    begin = end;
                }
            }

        }
        return dis_count;
    }
}