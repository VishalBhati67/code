
import java.util.*;

class Item {
    int profit, weight;
    double ratio;

    Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        ratio = (double) profit / weight;
    }
}

public class 3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit and weight of item " + (i + 1) + ": ");
            int p = sc.nextInt();
            int w = sc.nextInt();

            items[i] = new Item(p, w);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalProfit += item.profit;
            } else {
                totalProfit += item.ratio * capacity;
                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}