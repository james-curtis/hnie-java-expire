package org.expire8;

import java.util.Random;

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
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (T2.LOCK) {
                System.out.printf("%s count:%d\n", Thread.currentThread().getName(), T2.count++);
            }
        }
    }
}
