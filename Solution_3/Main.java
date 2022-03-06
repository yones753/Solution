package Solution_3;

public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        Add add = new Add(x,y);
        Multi multi = new Multi(x,y);
        Minus minus = new Minus(x,y);
        Division division = new Division(x,y);

        Thread addThread = new Thread(add);
        Thread subThread = new Thread(minus);
        Thread divThread = new Thread(division);
        Thread multiThread = new Thread(multi);

        addThread.start();
        subThread.start();
        divThread.start();
        multiThread.start();

    }
}
