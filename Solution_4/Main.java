package Solution_4;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int x, n;

            Scanner sc = new Scanner(System.in);
            System.out.print("Insert X :");
            x = sc.nextInt();
            System.out.print("Insert N :");
            n = sc.nextInt();
            var factorial = new Factorial(x,n);
            System.out.println("result :"+factorial.calcFactorial());

        }
}
