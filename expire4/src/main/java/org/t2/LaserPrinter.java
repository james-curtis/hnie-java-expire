package org.t2;

public class LaserPrinter extends Printer{

    @Override
    public void print(String content) {
        System.out.printf("LaserPrinter: %s%n", content);
    }
}
