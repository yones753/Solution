package Solution_3;

public class Add implements Runnable{

    int x;
    int y;

    public Add(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" ->"+ x+y);

    }
}
