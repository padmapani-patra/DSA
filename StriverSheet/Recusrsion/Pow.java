class Pow {
    public double myPow(double x, int n) {
         if (n == 0) return 1;

        if (n < 0) {
            x = 1 / x;
            // Handle Integer.MIN_VALUE by reducing the problem size
            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, Integer.MAX_VALUE); // Multiply by x once to account for the extra power
            }
            n = -n;
        }

        if (n % 2 == 0) return myPow(x * x, n / 2);
        else return x * myPow(x * x, n / 2);
    }
}