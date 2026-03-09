package com.practice.javacode;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;  //updating min price
            }else{
                int profit = price - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 7, 5, 3, 6,1,5,9,10,2, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
