package org.numbers;

public class Armstrong {
    public static void main(String[] args) {
        int n=153;
int temp=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        System.out.println("Sum of the cubes of the digits is Armstrong - 33w"+ (sum==temp));
    }

}
