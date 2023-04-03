package lesson14.homework1;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread " + getName() + " running " + i);
        }
    }

    public MyThread(String name) {
        super(name);
    }
}
