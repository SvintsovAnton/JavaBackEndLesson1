package task01;

public class Main {

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThred2 = new MyThread2();

        myThread1.start();

        Thread thread = new Thread(myThred2);
        thread.setDaemon(true);
        thread.start();


        //
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}