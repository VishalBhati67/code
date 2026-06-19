import java.util.Scanner;

public class Knapsack01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] profit = new int[n + 1];
        int[] weight = new int[n + 1];

        System.out.println("Enter profits:");

        for (int i = 1; i <= n; i++) {
            profit[i] = sc.nextInt();
        }

        System.out.println("Enter weights:");

        for (int i = 1; i <= n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {

            for (int w = 0; w <= capacity; w++) {

                if (i == 0 || w == 0) {

                    dp[i][w] = 0;

                } else if (weight[i] <= w) {

                    dp[i][w] = Math.max(
                        profit[i] + dp[i - 1][w - weight[i]],
                        dp[i - 1][w]
                    );

                } else {

                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println(
            "Maximum Profit = " + dp[n][capacity]
        );

        sc.close();
    }
}