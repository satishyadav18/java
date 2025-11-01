import java.util.*;

class OddOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findOdd(arr, n));
        sc.close();
    }

    static int findOdd(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even (to compare pairs properly)
            if (mid % 2 == 1) mid--;

            if (arr[mid] == arr[mid + 1])
                low = mid + 2;
            else
                high = mid;
        }
        return arr[low];
    }
}
