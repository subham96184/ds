package org.numbers;

import java.util.Scanner;

public class PrimeOrNot {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0, 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i * i <= n; i += 2) { // check till sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}
