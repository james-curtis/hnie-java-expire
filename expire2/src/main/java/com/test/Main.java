package com.test;

import java.util.*;

public class Main {
    /**
     * 创建如下数组，并打印数组
     */
    public void createList() {
        List<List<Character>> list = new ArrayList<>();
        list.add(Arrays.asList('1', '2', '3', '4', '5'));
        list.add(Arrays.asList('8', 'a', 'b', 'c'));
        list.add(Arrays.asList('d', 'e'));
        System.out.println(list);
    }

    /**
     * 判断一个数组中是否存在相同的元素，如果存在相同的元素则输出“重复”，否则输出“不重复”。
     *
     * @param list
     * @param <T>
     * @example 输入样例1： 1 2 3 4 5 输出样例1： 不重复 输入样例2： 1 2 2 3 4 输出样例2： 重复
     */
    public <T> void isRepeat(List<T> list) {
        HashSet<T> set = new HashSet<>(list);
        if (set.toArray().length != list.size()) {
            System.out.println("重复");
        } else {
            System.out.println("不重复");
        }
    }

    /**
     * + 编写程序，利用随机函数产生10个整数，（1）按升序排列输出。（2）将原数组元素对调，并输出对调后的结果。
     *
     * @param size
     * @param maxSize
     * @param minSize
     */
    public void createAndReverse(int size, int maxSize, int minSize) {
        Random random = new Random();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt((maxSize - minSize + 1)) + minSize;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        var linear = new ArrayList<Integer>();
        for (var item : list) {
            linear.add(item);
        }
        Collections.reverse(linear);
        System.out.println(linear);
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.createList();

        System.out.println("================================================");

        var scanner = new Scanner(System.in);
        int length = 5;
        var list = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }

        test.isRepeat(list);

        System.out.println("================================================");
        test.createAndReverse(10, 100, 0);
    }
}
