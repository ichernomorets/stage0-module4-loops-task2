package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = 0;
        int multiplyByAndToInclusiveAbs = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;

        while (n <= multiplyByAndToInclusiveAbs && multiplyByAndToInclusive != 0) {
            System.out.println(n * multiplyByAndToInclusive);

            ++n;
        }
    }
}
