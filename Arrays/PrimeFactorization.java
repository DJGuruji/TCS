public class PrimeFactorization {
    public static void main(String[] args) {
        int number = 56; // Replace with any number you want to find prime factors for
        System.out.println("Prime factors of " + number + ":");
        printPrimeFactors(number);
    }

    // Method to print the prime factors of a number
    public static void printPrimeFactors(int number) {
        // Handle the factor of 2 first to ensure it's not missed
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Now check for odd factors starting from 3
        for (int i = 3; i * i <= number; i += 2) {
            // While i divides the number, it's a prime factor
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If number is still greater than 2, it must be a prime number
        if (number > 2) {
            System.out.print(number);
        }
    }
}
