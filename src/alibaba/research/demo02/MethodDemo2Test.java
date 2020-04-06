package alibaba.research.demo02;

import java.util.function.BiFunction;

/**
 * @program: Java workspace
 * @description: 练习方法引用
 * @author: typhoon
 * @create: 2020-04-06 18:34
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class MethodDemo2Test {
    public static void main(String[] args) {
        FormatString formatString = String::toUpperCase;
        // toUppercase 转化字符串为大写
        String value = formatString.getValue("helloworld");
        // 接受转化后的字符串
        System.out.println("数据的值为: " + value);
        // 输出转化后的字符串

        String string = "helloworld";
        // 此处需要创建字符串的对象
        BiFunction<Integer,Integer,String> biFunction = string::substring;
        // 使用两个参数的，返回一个String，通过对象调用实例方法
        String apply = biFunction.apply(1, 3);
        // 传递需要切割的索引
        System.out.println("apply = " + apply);
        // 输出切割后的字符串
    }
}

@FunctionalInterface
interface FormatString{

    /**.
     * @param string 这是字符串参数
     * @return 返回是格式化的参数
     */
    String getValue(String string);
}