package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2;
        while (n <= printToInclusive && printToInclusive > 2) {
            boolean isPrime = true;
            int i = 2;
            while (i <= n - 1) {
                if (n % i == 0) {
                    isPrime = false;
                }
                ++i;
            }
            if (isPrime) {
                System.out.println(n);
            }
            ++n;
        }
    }
}
