import java.util.Scanner;

public class KruskalAlgorithm {

    static int[] parent = new int[10];

    static int find(int i) {
        while (parent[i] != 0)
            i = parent[i];
        return i;
    }

    static int union(int i, int j) {

        if (i != j) {
            parent[j] = i;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int n, min, cost = 0, edges = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    a[i][j] = 999;
            }
        }

        while (edges < n) {

            min = 999;
            int u = 0, v = 0;

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (a[i][j] < min) {
                        min = a[i][j];
                        u = i;
                        v = j;
                    }
                }
            }

            int i = find(u);
            int j = find(v);

            if (union(i, j) == 1) {

                System.out.println(u + " - " + v + " = " + min);

                cost += min;
                edges++;
            }

            a[u][v] = a[v][u] = 999;
        }

        System.out.println("Minimum cost = " + cost);
    }
}

