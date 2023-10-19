package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        int sum = 1;
        int factorial = 1;

        while(count <= power) {
            factorial = count;
            sum  = 1;
            while (factorial != 1) {
                sum = sum * 2;
                factorial--;
            }
            System.out.println(sum);
            count++;
        }

    }
}
