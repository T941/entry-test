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
        List<String> token = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(token);
        System.out.println(token);
    }

}

