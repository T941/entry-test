package reverseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "1 3 5 7 9";
        List<String> token = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(token);
        System.out.println(token);
    }

}

