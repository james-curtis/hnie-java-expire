package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        if (username.length() >= 3) {
            System.out.println("用户名格式正确");
        } else {
            throw new MyException("用户名小于三位");
        }

    }

}

class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
}