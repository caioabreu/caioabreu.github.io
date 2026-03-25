public class Main {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 10, 13, 17, 20, 97};

        System.out.println("Prime number verification:");
        for (int n : testNumbers) {
            System.out.printf("%d is %s%n", n, isPrime(n) ? "prime" : "not prime");
        }
    }
}
