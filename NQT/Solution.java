class Solution {
    public static void rearrange(int[] Arr) {
        int n = Arr.length;
        int[] temp = new int[n];
        int index = 0;

        // First copy non-multiples of 10
        for(int i = 0; i < n; i++) {
            if(Arr[i] % 10 != 0)
                temp[index++] = Arr[i];
        }

        // Then copy multiples of 10
        for(int i = 0; i < n; i++) {
            if(Arr[i] % 10 == 0)
                temp[index++] = Arr[i];
        }

        // Copy back to original array
        for(int i = 0; i < n; i++)
            Arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] Arr = {10, 12, 5, 40, 30, 7, 5, 9, 10};
        rearrange(Arr);
        for (int x : Arr)
            System.out.print(x + " ");
    }
}
