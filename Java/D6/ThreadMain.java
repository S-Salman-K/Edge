class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<3;i++)
            System.out.println(i);
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
//        for(int i=0;i<6;i++)
//            System.out.println(i);
//        MyThread t4 = new MyThread();
//        MyThread t5 = new MyThread();
//        MyThread t6 = new MyThread();
//        t4.start();
//        t5.start();
//        t6.start();
    }

}
