package homework;

//решение через два потока
public class SolutionViaTwoThread {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int quantities = thread1.getQuantity() + thread2.getQuantity();
        System.out.println("quantities of number by condition: " + quantities);

    }
}
