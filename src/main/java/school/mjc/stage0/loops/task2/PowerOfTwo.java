package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0){
            int n = 0;
            int result = 1;
            while (n <= power) {
                if (n == 0) {
                    result = 1;
                } else {
                    result = result * 2;
                }

                if (result > 0) {
                    System.out.println(result);
                } else {
                    System.out.println("too much power");
                }

                ++n;
            }
        }
        else {
            System.out.println("too much power");
        }
    }
}
