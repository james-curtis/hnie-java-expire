package org.expire8;

public class T2 implements Runnable {

    static Integer count = 0;
    static final Integer LOCK = 0;

    public static void main(String[] args) {
        new Thread(new T2()).start();
        new Thread(new T2()).start();
        new Thread(new T2()).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (T2.LOCK) {
                System.out.println("%s count:%d".formatted(Thread.currentThread().getName(), T2.count++));
            }
        }
    }
}
