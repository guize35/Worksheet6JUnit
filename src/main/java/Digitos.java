public class Digitos {

    public static double calcluaMedia(int number) {
        number = Math.abs(number);
        int count = 0;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) sum / count;
    }
}
