package pl.akademiakodu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        new Main();

    }

    private ExecutorService executorService;

    public Main() {
//            executorService = Executors.newFixedThreadPool(5);
        executorService = Executors.newCachedThreadPool();

        long number = 2;
//        long score = number * number;

        Runnable squareNumber = new Runnable() {
            @Override
            public void run() {
                long score = number * number;
                System.out.println(Thread.currentThread().getName() + " | Wynik [1] = " + score);
            }
        };

        Runnable squareNumber1 = new Runnable() {
            @Override
            public void run() {
                long score = number * number;
                System.out.println(Thread.currentThread().getName() + " | Wynik [2] = " + score);
            }
        };

        Runnable squareNumber2 = new Runnable() {
            @Override
            public void run() {
                long score = number * number;
                System.out.println(Thread.currentThread().getName() + " | Wynik [3] = " + score);
            }
        };

        Runnable squareNumber3 = new Runnable() {
            @Override
            public void run() {
                long score = number * number;
                System.out.println(Thread.currentThread().getName() + " | Wynik [4] = " + score);
            }
        };

        Runnable squareNumber4 = new Runnable() {
            @Override
            public void run() {
                long score = number * number;
                System.out.println(Thread.currentThread().getName() + " | Wynik [5] = " + score);
            }
        };

        executorService.execute(squareNumber);
        executorService.execute(squareNumber1);
        executorService.execute(squareNumber2);
        executorService.execute(squareNumber3);
        executorService.execute(squareNumber4);
//        executorService.shutdown();
        executorService.shutdownNow();

    }
}
