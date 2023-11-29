package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int n = 0;

        while (n <= printToInclusive) {
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                ++i;
            }

            System.out.println(fact);

            ++n;
        }
    }
}
