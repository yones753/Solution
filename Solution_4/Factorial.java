package Solution_4;

public class Factorial {

    private int x;
    private int n;
    private double totalAns = 0;
    int j = 1;

    public Factorial(int x, int n) {
        this.x = x;
        this.n = n;
    }

    public double calcFactorial(){
        for(int i = 2;i <=2*n;i +=2){
            if (j % 2 != 0) {
                totalAns += -(Math.pow(x, i) / factorial(j));
            } else {
                totalAns += Math.pow(x, i) / factorial(j);
            }
            j++;
        }
        return totalAns;
    }

    public int factorial(int num) {
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }
        return ans;
    }

}
