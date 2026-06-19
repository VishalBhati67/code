
import java.util.Scanner;

public class TravellingSalesman {

    static int n;
    static int[][] cost;
    static boolean[] visited;

    static int tsp(int city, int count,
                   int costSoFar, int ans) {

        if (count == n &&
            cost[city][0] > 0) {

            return Math.min(
                ans,
                costSoFar + cost[city][0]
            );
        }

        for (int i = 0; i < n; i++) {

            if (!visited[i] &&
                cost[city][i] > 0) {

                visited[i] = true;

                ans = tsp(
                    i,
                    count + 1,
                    costSoFar + cost[city][i],
                    ans
                );

                visited[i] = false;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter number of cities: "
        );

        n = sc.nextInt();

        cost = new int[n][n];
        visited = new boolean[n];

        System.out.println(
            "Enter cost matrix:"
        );

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                cost[i][j] = sc.nextInt();
            }
        }

        visited[0] = true;

        int ans = tsp(0, 1, 0,
                Integer.MAX_VALUE);

        System.out.println(
            "Minimum travelling cost = "
            + ans
        );

        sc.close();
    }
}

