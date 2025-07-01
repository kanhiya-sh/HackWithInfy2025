package L1;

import java.util.*;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = sc.nextInt();
        }

        int money = sc.nextInt();
        System.out.println(BuyTwoChocolates(chocolates, money));
    }

    public static int BuyTwoChocolates(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int totalCost = min1 + min2;
        return (totalCost <= money) ? (money - totalCost) : money;
    }
}
