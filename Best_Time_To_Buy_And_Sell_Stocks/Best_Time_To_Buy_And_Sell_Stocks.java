class Solution {
    public int maxProfit(int[] prices) {
        //Starting pointer
        int left = prices[0];
        //Base case
        int max = 0;
        // i = right pointer
       for(int i = 1; i < prices.length; i++) {
        int profit = 0;
        if(left < prices[i]) {
            profit = prices[i] - left;
            max = Math.max(max, profit);
        } else {
            //Set left to the lowest price found
            left=prices[i];
        }
       }
       return max;
    }
}