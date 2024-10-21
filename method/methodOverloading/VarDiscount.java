class Method {
    double[] discount(double... prices) {
        double sum = 0;
        for (double x : prices) {
            sum += x;
        }
        System.out.println("Total price is: " + sum);

        double discountAmnt = 0;
        double newPrice = sum;

        if (sum < 5000) {
            System.out.println("No discount");
        } else if (sum <= 10000) {
            discountAmnt = (sum * 10) / 100;
            newPrice = sum - discountAmnt;
        } else if (sum <= 30000) {
            discountAmnt = (sum * 15) / 100;
            newPrice = sum - discountAmnt;
        } else {
            discountAmnt = (sum * 20) / 100;
            newPrice = sum - discountAmnt;
        }

        return new double[]{newPrice, discountAmnt};
    }
}

class VarDiscount {
    public static void main(String[] args) {
        Method m = new Method();
        double[] result = m.discount(3999.50, 369.20, 456.258, 451.97);
        System.out.println("Discount is: " + result[1]);
        System.out.println("Final price after discount: " + result[0]);
    }
}
