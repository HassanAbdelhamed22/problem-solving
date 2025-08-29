public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < (prices.length); i++) {
            int profit = prices[i] - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};

        int max = maxProfit(nums);
        System.out.println(max);
    }
}
