public class VIII_QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1, j = l;
        for (; j <= h; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 91,34,56,778,89,79,678 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
