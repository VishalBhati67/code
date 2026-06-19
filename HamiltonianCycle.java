import java.util.Scanner;

public class HamiltonianCycle {

    int n;
    int[][] graph;
    int[] path;

    boolean isSafe(int v, int pos) {

        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++) {

            if (path[i] == v)
                return false;
        }

        return true;
    }

    boolean hamCycleUtil(int pos) {

        if (pos == n) {

            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < n; v++) {

            if (isSafe(v, pos)) {

                path[pos] = v;

                if (hamCycleUtil(pos + 1))
                    return true;

                path[pos] = -1;
            }
        }

        return false;
    }

    void hamCycle() {

        path = new int[n];

        for (int i = 0; i < n; i++)
            path[i] = -1;

        path[0] = 0;

        if (!hamCycleUtil(1)) {

            System.out.println(
                "No Hamiltonian Cycle Exists"
            );

            return;
        }

        printSolution();
    }

    void printSolution() {

        System.out.println(
            "Hamiltonian Cycle:"
        );

        for (int i = 0; i < n; i++) {

            System.out.print(
                path[i] + " "
            );
        }

        System.out.println(path[0]);
    }

    public static void main(String[] args) {

        HamiltonianCycle h =
            new HamiltonianCycle();

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter number of vertices: "
        );

        h.n = sc.nextInt();

        h.graph = new int[h.n][h.n];

        System.out.println(
            "Enter adjacency matrix:"
        );

        for (int i = 0; i < h.n; i++) {

            for (int j = 0; j < h.n; j++) {

                h.graph[i][j] = sc.nextInt();
            }
        }

        h.hamCycle();

        sc.close();
    }
}
