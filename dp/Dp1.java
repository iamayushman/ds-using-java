// max profit share

public class Dp1 {
    public static void main(String[] args) {
        int[] sharePrices = new int[] { 7, 1, 5, 3, 6, 4 };
        int max = maxProfit(sharePrices);
        System.out.println("as: " + max);
    }

    static int maxProfit(int[] price) {

        int buyPrice = price[0];
        int maxProfit = 0;
        for (int day = 0; day < price.length; day++) {
            if (price[day] < buyPrice) {
                buyPrice = price[day];
            } else {
                int currentProfit = price[day] - buyPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }

}
