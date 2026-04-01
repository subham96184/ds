package org.patterns;

public class AO_I_Pattern {
    /*  1
        01
        101
        0101  */
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            int num=i%2==0?0:1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num=num==0?1:0;
            }
            System.out.println();
        }

    }
}