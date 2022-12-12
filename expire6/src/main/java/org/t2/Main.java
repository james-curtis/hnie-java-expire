package org.t2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            main.isTriangle(a, b, c);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    void isTriangle(int a, int b, int c) throws IllegalArgumentException {
        if (a + b < c || Math.abs(a - b) > c) {
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        }
        System.out.println("三角形的边长分别为：%d, %d, %d".formatted(a, b, c));
    }

}
