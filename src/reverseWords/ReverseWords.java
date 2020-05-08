package reverseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        String s1[] = s.split(" ");
        String ans = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            ans += s1[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0, ans.length() - 1));
    }

}

