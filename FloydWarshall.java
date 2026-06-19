import java.util.Scanner;

public class FloydWarshall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                graph[i][j] = sc.nextInt();

                if (i != j && graph[i][j] == 0) {
                    graph[i][j] = 999;
                }
            }
        }

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (graph[i][k] + graph[k][j]
                            < graph[i][j]) {

                        graph[i][j] =
                            graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        System.out.println(
            "\nShortest Path Matrix:"
        );

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(
                    graph[i][j] + "\t"
                );
            }

            System.out.println();
        }

        sc.close();
    }
}