package homework;

public class Thread1 extends Thread {

    private int quantity = 0;

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i <= 1_000_000_000; i++) {
            if (i % 21 == 0 && Integer.toString(i).contains("3")) {
                count++;
            }
        }
        System.out.println("thread 1 " + count);
        quantity = count;
    }

    ;
}

