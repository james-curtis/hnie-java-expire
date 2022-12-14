package com.test;

import java.util.ArrayList;
import java.util.List;

public class Count {

    List<Long> list = new ArrayList<>();

    void fab(int current, int deep) {
        if (current >= deep) {
            return;
        }
        list.add(list.get(current - 1) + list.get(current - 2));
        fab(current + 1, deep);
    }

    public static void main(String[] args) {
        Count count = new Count();
        count.list.add(1L);
        count.list.add(1L);
        count.fab(2, 50);
        System.out.println(count.list.get(49));
    }

}
