package editDistance;

import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1;
        String word2;
        word1=scanner.nextLine();
        word2=scanner.nextLine();
        int len = word1.length();
        int len2 = word2.length();
        int[][] memo = new int[len][len2];
        int i = helper(memo, word1, word2, 0, 0);
        System.out.println(i);
    }
    private static int helper(int[][] memo, String word1, String word2, int i, int j) {
        if (i >= word1.length() && j >= word2.length())
            return 0;
        else if (i >= word1.length())
            return word2.length() - j;
        else if (j >= word2.length())
            return word1.length() - i;
        if (memo[i][j] != 0)
            return memo[i][j];
        if (word1.charAt(i) != word2.charAt(j)) {
            memo[i][j] = 1
                    + Math.min(Math.min(helper(memo, word1, word2, i + 1, j), helper(memo, word1, word2, i, j + 1)),
                    helper(memo, word1, word2, i + 1, j + 1));
            return memo[i][j];
        } else {
            memo[i][j] = helper(memo, word1, word2, i + 1, j + 1);
            return memo[i][j];
        }
    }
}
