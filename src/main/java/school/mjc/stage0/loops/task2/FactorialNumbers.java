package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int sum = 1;
        int factorial = 1;

        while(count <= printToInclusive) {
            factorial = count;
            sum  = 1;
            while (factorial != 0) {
                sum = sum * factorial;
                factorial--;
            }
            System.out.println(sum);
            count++;
        }

    }
}
