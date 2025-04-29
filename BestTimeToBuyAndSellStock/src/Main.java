//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//121. Best Time to Buy and Sell Stock
//            Easy
//    Topics
//            Companies
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



//    Example 1:
//
//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//    Example 2:
//
//    Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transactions are done and the max profit = 0.

    public static int bestTimeToBuyAndSellStock(int [] prices){
         int maxProfit=0;
         int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){

            if(prices[i]<minPrice){
                minPrice=prices[i];
            }

            if((prices[i]-minPrice)>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        System.out.println("minPrice :"+minPrice);

          return maxProfit;

    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        int[] prices={7,6,4,3,1};
               // {7,1,5,3,6,4};

        int maxProfit=bestTimeToBuyAndSellStock(prices);
        System.out.println("maxProfit :"+maxProfit);
    }
}