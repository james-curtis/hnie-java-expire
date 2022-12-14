
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollTest {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收给定的一行字符串
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();
        while (scanner.hasNext()) {
            lines.add(scanner.next());
        }
        // 第二步：切割字符串

        // 第三步：创建集合

        // 第四步：往集合中添加元素

        // 第五步：删除第一个元素和最后一个元素
        lines.remove(0);
        lines.remove(lines.size() - 1);
        // 第六步：往集合中添加hello和educoder
        lines.add("hello");
        lines.add("educoder");
        // 第七步：修改集合中第三个元素为list
        lines.set(2, "list");
        // 第八步：打印集合
        System.out.println(lines);
        /********** End **********/

    }
}
