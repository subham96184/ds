package org.patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //increasing
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            //Decreasing
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
