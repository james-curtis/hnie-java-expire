package org.example;

import org.example.entity.Good;

import java.util.HashSet;
import java.util.Set;

public class T2 {

    public static void main(String[] args) {
        Set<Good> goodDatabase = new HashSet<Good>();
        goodDatabase.add(new Good("1", "高等数学", 1, "高等教育出版社"));
        goodDatabase.add(new Good("1", "高等数学", 1, "高等教育出版社"));
        goodDatabase.add(new Good("2", "高等数学", 1, "高等教育出版社"));
        goodDatabase.add(new Good("3", "高等数学", 1, "高等教育出版社"));
        for (Good good : goodDatabase) {
            System.out.println(good);
        }
    }
}
