package reverseInteger;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int reversedNumber = 0;
        int temp = 0;
        while (number > 2147483647 || number < -2147483647){
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;}
        if (reversedNumber > 2147483647 || reversedNumber < -2147483647) {
            System.out.println("0");
        } else {

            System.out.println(reversedNumber);
        }
    }
}
