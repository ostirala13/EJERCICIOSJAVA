package ejerciciosjava.hilos;

public class SynchronizedMethods  {
    private int sum = 0;
    public static int staticSum = 0;

    SynchronizedMethods(){
        super();
    }

    public void calculate() {
        setSum(getSum() + 1);
    }

    public void setSum(int sum){
        this.sum = sum;
    }

    public int getSum(){
        return this.sum;
    }

    public synchronized void synchronisedCalculate() {
        setSum(getSum() + 1);
    }

    public static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }
}
