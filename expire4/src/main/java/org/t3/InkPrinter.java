package org.t3;

public class InkPrinter extends Printer implements IScan {

    @Override
    public void print(String content) {
        System.out.printf("InkPrinter: %s%n", content);
    }

    @Override
    public String scan() {
        return "I am scanning";
    }

}
