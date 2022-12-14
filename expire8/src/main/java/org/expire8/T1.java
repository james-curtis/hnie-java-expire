package org.expire8;

import static java.lang.Thread.sleep;

public class T1 extends Thread {

    public static void main(String[] args) {
        new Thread(new T1()).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        new Thread(new T1()).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
        }
    }
}