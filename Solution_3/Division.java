package Solution_3;

public class Division implements Runnable {


    private int x;
    private int y;
    private int ans  =0 ;


    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try {
           ans= x / y;
        }catch (ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
        System.out.println(Thread.currentThread().getName() + " ->" + ans);

    }
}
