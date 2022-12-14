/*
仔细阅读给出的代码框架及注释，在 Begin-End 间编写程序代码，使用 HashMap 集合的常用方法完成所给要求，具体如下：
- 接收给定的一行字符串（如：红烧鱼：50，小炒牛肉：75，...）；
- 切割字符串，把切割后的元素添加进 HashMap 集合中；
- 往集合中添加一道菜，菜名：lamb，价格：50；
- 输出所有菜名（不含价格）；
- 删除红烧鱼和小炒牛肉这两道菜后输出集合长度；
- 打印集合。

注意：字符串中的逗号和分号都是中文符号。
*/

import java.util.*;

public class CollTest3 {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 粉蒸肉：50，红烧鱼：50，小炒牛肉：75，手撕包菜：20，蒜蓉虾：100
        // 第一步：接收给定字符串
        Map<String, Integer> map = new HashMap<>();
        // 第二步：切割字符串
        Scanner sc = new Scanner(System.in);
        for (String item : sc.nextLine().split("，")) {
            String[] list = item.split("：");
            map.put(list[0], Integer.valueOf(list[1]));
        }
        // 第三步：创建 HashMap 集合,key为菜名，value为价格

        // 第四步：添加数据到集合中

        // 第五步：往集合中添加给定的一道菜
        map.put("lamb", 50);
        // 第六步：输出所有菜名
        System.out.println(map.keySet());
        // 第七步：删除红烧鱼和小炒牛肉这两道菜后输出集合长度
        map.remove("红烧鱼");
        map.remove("小炒牛肉");
        System.out.println(map.size());
        // 第八步：打印集合
        System.out.println(map);
        /********** End **********/
    }
}