package org.expire7;

import java.io.*;
import java.util.*;

public class T2 {

    public static void main(String[] args) throws IOException {
        String filePath = T2.class.getClassLoader().getResource("").getPath() + "test.out";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            bufferedOutputStream.write((scanner.nextLine() + "\n").getBytes("UTF-8"));
        }
        scanner.close();
        bufferedOutputStream.close();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath));
        int b = 0;
        List<Byte> list = new ArrayList<Byte>();
        while (true) {
            b = inputStream.read();
            if (b == -1) {
                break;
            }
            list.add((byte) b);
        }

        byte[] bytes = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bytes[i] = list.get(i);
        }
        System.out.print(new String(bytes));
    }

}
