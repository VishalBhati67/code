public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;

        int low = 0;
        int high = arr.length - 1;
        int found = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                found = 1;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }
    }
}