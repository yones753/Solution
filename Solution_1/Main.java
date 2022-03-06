package Solution_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert your name and your id number :");
        String input = scan.nextLine();
        var info = input.split(" ");
        String name = info[0];
        int id = Integer.parseInt(info[1]);
        System.out.println( name + " : " + UpdateIds.updateId(id));
    }
}
