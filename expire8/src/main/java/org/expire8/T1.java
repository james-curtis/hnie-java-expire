package org.expire8;

import java.util.Random;

public class T1 extends Thread {

    public static void main(String[] args) {
        Runnable fun = () -> {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(new Random().nextInt(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(new T1()).start();
        new Thread(fun).start();
        new Thread(new T1()).start();
        new Thread(fun).start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}