package maximalRectangle;

import java.util.Scanner;


public class MaximalRectangle {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("số dòng: ");
        a = scanner.nextInt();
        System.out.println("số cột: ");
        b = scanner.nextInt();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("phan tu thu [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        if (matrix == null || matrix.length == 0) {
            System.out.println("false");
        }
        int maxArea = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix2[i][j] = j == 0 ? 1 : matrix2[i][j - 1] + 1;
                    int length = matrix2[i][j];
                    for (int k = i; k >= 0; k--) {
                        length = Math.min(length, matrix2[k][j]);
                        int width = i - k + 1;
                        maxArea = Math.max(maxArea, length * width);
                    }
                }
            }
        }

        System.out.println("area " + maxArea);

    }
}



