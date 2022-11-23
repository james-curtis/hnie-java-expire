package org.t2;

public class InkPrinter extends Printer{

    @Override
    public void print(String content) {
        System.out.printf("InkPrinter: %s%n", content);
    }
}
