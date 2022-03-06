package Solution_2;

import java.util.Scanner;

public class Matrix {


    public static void check() {

        int a[][] = new int[40][40];
        int b[][] = new int[10][10];
        boolean flag = false;

        for (int i = 0; i < a.length - b.length + 1; i++) {
            for (int j = 0; j < a[0].length - b[0].length + 1; j++) {
                if (a[i][j] == b[0][0]) {
                    flag = true;
                    for (int k = 0; k < b.length; k++) {
                        for (int l = 0; l < b[0].length; l++) {
                            if (a[i + k][j + l] != b[k][l]) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println(flag);
                        return;
                    }
                }
            }
        }
        System.out.println(flag);
    }

    public static void insertMatrixData(Scanner scan, int[][] matrix, int matrixSize) {
        System.out.println("Insert Matrix Data " + matrixSize + "  :");

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int matrixSize) {
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}


