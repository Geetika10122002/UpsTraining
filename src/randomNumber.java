import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println("Random Numbers:");
        for (int number : randomNumbers) {
            System.out.print(number+" ");
            if (isPrime(number)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
