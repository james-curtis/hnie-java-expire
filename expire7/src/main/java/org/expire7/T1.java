package org.expire7;

import java.util.*;

public class T1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(list);
        list.sort(Integer::compare);

        System.out.println(list);
    }
}