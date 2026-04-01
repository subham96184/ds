package org.patterns;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        //int rows=5;
        for (int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println(); // Fixed: removed "\n" to avoid extra blank lines
        }
    }
}
