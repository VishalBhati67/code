import java.util.Scanner;

public class PrimsAlgorithm {

    public static void main(String[] args) {

        int n, min, total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();

        int[][] cost = new int[n][n];
        int[] visited = new int[n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                cost[i][j] = sc.nextInt();

                if (cost[i][j] == 0)
                    cost[i][j] = 999;
            }
        }

        visited[0] = 1;

        System.out.println("Edges in MST:");

        for (int k = 0; k < n - 1; k++) {

            min = 999;
            int a = 0, b = 0;

            for (int i = 0; i < n; i++) {

                if (visited[i] == 1) {

                    for (int j = 0; j < n; j++) {

                        if (visited[j] == 0 && cost[i][j] < min) {
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }

            visited[b] = 1;

            System.out.println(a + " - " + b + " = " + min);

            total += min;
        }

        System.out.println("Total cost = " + total);
    }
}
