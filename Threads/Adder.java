package Threads;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Adder implements Runnable {

    private int[] array;
    private int start;
    private int end;

    public Adder(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum(){
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public void run() {
        System.out.println(getSum());
    }
    public static void main(String[] args) throws InterruptedException {
        int [] tableau = new int [100];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i;
        }

        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i <  10; i++) {
            pool.execute(new Adder(tableau, i*10, (i+1)*10));
            Thread.sleep(1000);
        }


        System.out.println(Arrays.stream(tableau).sum());
        pool.shutdown();

    }
}
