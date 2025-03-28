public class buy_and_sell_stock {

    public static int stock(int prices[]) {
        int buy = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                int profit = prices[i] - buy;
                max_profit = Math.max(profit, max_profit);
            } else {
                buy = prices[i];
            }
        }
        return max_profit;

    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stock(prices));
    }

}
