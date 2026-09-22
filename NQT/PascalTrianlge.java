class PascalTrianle{
    public static void printPascal(int n) {

        for (int i = 0; i < n; i++) {

            int val = 1;  // first value of every row

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);  // next value formula
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascal(5);
    }
}