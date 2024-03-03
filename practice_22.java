public class practice_22 {
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static void factorial1(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = n;
        System.out.print("0");
        for (int i = 0; i < count - 1; ++i) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    static int sum_rec(int n) {
        // first n numbers of sum
        if (n == 1) {
            return 1;
        } else {
            return n + sum_rec(n - 1);
        }
    }

    static int fib(int n) {
        // what the number at the place of n
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void pattern_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            pattern_rec(n - 1);
        }
    }
    static void pattern_rec1(int n) {
        if (n > 0) {
            pattern_rec1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // System.out.println(factorial(6));
        // factorial1(6);
        // fibonacci(15);
        // System.out.println(sum_rec(5));
        // System.out.println(fib(7));
        // System.out.print(pattern_rec(7));
        pattern_rec1(7);
    }
}
