package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        boolean isTrue = true;
        if (printToInclusive <= 1) {
            System.out.print("");
        } else {
            while (number <= printToInclusive) {
                int counter = 2;
                isTrue = true;
                while (counter < number) {
                    if (number % counter == 0) {
                        isTrue = false;
                        break;
                    }
                    counter++;

                }

                if (isTrue) {
                    System.out.println(number);
                }
                number++;
            }
        }
    }
}
