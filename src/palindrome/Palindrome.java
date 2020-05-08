package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        Scanner scanner =new Scanner(System.in);
        s=scanner.nextLine();
        if (s.length() > 1000 || s.length() == 0)
            System.out.println("false");
        if (s.equals(new StringBuilder(s).reverse().toString()))
            System.out.println("false");
        int max = 0, n = s.length();
        String result ="";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (checkPalindrome(sub) && sub.length() >= max) {
                    max = sub.length();
                    result = sub;
                }
            }
        }
        System.out.println(result);
    }

    private static boolean checkPalindrome(String s) {
        for(int i =0; i< s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
