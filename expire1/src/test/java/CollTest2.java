/*
仔细阅读右侧编辑区内给出的代码框架及注释，在 Begin-End 间编写程序代码，整理给定的电话簿，具体要求如下：
- 接收给定的一行字符串（该字符串属于电话簿，包含多个电话号码，如：13545453432，13678909808,18834353432）；
- 使用 HashSet 去除电话簿中可能存在的重复电话号码；
- 按升序打印去重后的电话号码。

注意：电话簿中每个电话号码的分隔符是英文逗号。
*/

import java.util.*;

public class CollTest2 {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收给定的字符串
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // 第二步：切割字符串
        Set<String> set = new TreeSet<>(Arrays.asList(line.split(",")));
        // 第三步：创建集合

        // 第四步：将切割后的电话号码添加进集合

        // 第五步：输出去重后的电话号码
        for (String item : set) {
            System.out.println(item);
        }
        /********** End **********/
    }
}
