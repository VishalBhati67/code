import java.util.Scanner;

public class GraphColoring {

    int n;
    int[][] graph;
    int[] color;

    boolean isSafe(int node, int c) {

        for (int i = 0; i < n; i++) {

            if (graph[node][i] == 1 &&
                color[i] == c) {

                return false;
            }
        }

        return true;
    }

    boolean graphColor(int node, int m) {

        if (node == n) {
            return true;
        }

        for (int c = 1; c <= m; c++) {

            if (isSafe(node, c)) {

                color[node] = c;

                if (graphColor(node + 1, m))
                    return true;

                color[node] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        GraphColoring g = new GraphColoring();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        g.n = sc.nextInt();

        g.graph = new int[g.n][g.n];
        g.color = new int[g.n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < g.n; i++) {

            for (int j = 0; j < g.n; j++) {

                g.graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of colors: ");
        int m = sc.nextInt();

        if (g.graphColor(0, m)) {

            System.out.println(
                "Solution Exists:"
            );

            for (int i = 0; i < g.n; i++) {

                System.out.println(
                    "Vertex " + i +
                    " ---> Color " + g.color[i]
                );
            }

        } else {

            System.out.println(
                "Solution does not exist."
            );
        }

        sc.close();
    }
}