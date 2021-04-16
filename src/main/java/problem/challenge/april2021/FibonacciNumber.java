package problem.challenge.april2021;

public class FibonacciNumber {
    public int fib(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fib(n - 1) + fib(n - 2);
        }
    }
}
