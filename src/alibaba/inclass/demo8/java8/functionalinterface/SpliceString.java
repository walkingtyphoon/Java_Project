package alibaba.inclass.demo8.java8.functionalinterface;

import java.util.function.Consumer;

/**
 * @program: Java workspace
 * @description: 请按照格式：姓名:xx,性别：xxx。
 * 的格式将信息打印出来，要求将打印姓名
 * 的动作作为第一个Consumer 接口的Lambda实例，
 * 将打印性别的动作作为第二个，Consumer接口的
 * lambda实例，将两个Consumer接口按照顺序拼接到
 * 一起。
 * @author: typhoon
 * @create: 2020-04-01 14:37
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class SpliceString {

    /**.
     * @param args 这是主方法的参数
     */
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "哈尼克孜,女"};
        // 创建字符串集合
        showMessage(array, s1 -> System.out.print("姓名:" + s1.split(",")[0]), s -> System.out.println(",性别:" + s.split(",")[1]));
        // 输出切割后的，格式化的字符串[0]，代表切割后的第一个
    }

    /**.
     * @param array 字符串数组
     * @param consumer1 消费型函数式接口1
     * @param consumer2 消费型函数式接口2
     */
    public static void showMessage(String[] array, Consumer<String> consumer1, Consumer<String> consumer2) {
        // 接受字符串数组
        for (String s : array) {
            // 遍历字符串，分别传递给accept方法
            consumer1.andThen(consumer2).accept(s);
            // 调用accept方法接受参数
        }
    }
}