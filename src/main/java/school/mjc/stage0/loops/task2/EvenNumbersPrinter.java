package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int n = 0;
        while (n <= printTillInclusive) {
            if(n % 2 == 0) {
                System.out.println(n);
            }

            ++n;
        }
    }
}
