package reverseInteger;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int number;
        Scanner u = new Scanner(System.in);
        number = u.nextInt();
        int reversedNumber = 0;
        int temp = 0;
        while (number != 0) {
            temp = number % 10;
            if (reversedNumber > 2147483647 / 10 || (reversedNumber == 2147483647 / 10 && temp > 7)) {
                reversedNumber = 0;
                break;
            }
            if (reversedNumber < -2147483647 / 10 || (reversedNumber == -2147483647 / 10 && temp < -8)) {
                reversedNumber = 0;
                break;
            }
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        System.out.println(reversedNumber);

    }
}
