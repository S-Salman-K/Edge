package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

class Barrier implements Runnable {
    CyclicBarrier cb;
    public Barrier(CyclicBarrier cb) {
        this.cb = cb;
    }
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Before Await");
            cb.await();
            System.out.println(Thread.currentThread().getName() + " After Await");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierMain {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
            public void run() {
                System.out.println("All threads passed the barrier");
            }
        });
        Thread t1 = new Thread(new Barrier(cb), "T1");
        Thread t2 = new Thread(new Barrier(cb), "T2");
        Thread t3 = new Thread(new Barrier(cb), "T3");
        t1.start();
        t2.start();
        t3.start();

        Thread t4 = new Thread(new Barrier(cb), "T4");
        Thread t5 = new Thread(new Barrier(cb), "T5");
        Thread t6 = new Thread(new Barrier(cb), "T6");
        t4.start();
        t5.start();
        t6.start();
    }
}
