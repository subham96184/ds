package org.numbers;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            double sqrt = Math.sqrt(n);
            if (n % i == 0) {
                return false; // divisor found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 167;
        System.out.println(num + " is prime? " + isPrime(num));
    }
}