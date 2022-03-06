package Solution_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][]a =new int[40][40];
        int[][]b =new int[10][10];

        Matrix.insertMatrixData(scan,a,5);
        Matrix.printMatrix(a,5);
        Matrix.insertMatrixData(scan,b,2);
        Matrix.printMatrix(b,2);
       Matrix.check();


    }
}
