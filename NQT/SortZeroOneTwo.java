import java.util.Arrays;

public class SortZeroOneTwo {

    public static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 1, 0, 1, 2, 0, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
