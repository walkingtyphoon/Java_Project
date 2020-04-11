package alibaba.inclass.demo8.java8.functionalinterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @program: Java workspace
 * @description: 练习predicate函数式接口
 * @author: typhoon
 * @create: 2020-04-08 14:49
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class PredicateTest {

    @Test
    public void test1() {
        String string = "横看成岭侧成峰";
        // 创建需要校验的字符串
        boolean value = checkStringAnd(string, str -> string.length() > 5, str -> string.contains("横"));
        // 使用lambda表达式并返回检验信息
        System.out.println("value = " + value);
        // 输出校验后的状态信息
    }

    /**
     * @param string     需要检验的字符串
     * @param predicate1 第一个拼接的接口
     * @param predicate2 第二个拼接的接口
     * @return 判断后的状态
     */
    public static boolean checkStringAnd(String string, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.and(predicate2).test(string);
        // 这是调用链接后的校验方法
    }


    @Test
    public void test2() {
        String string = "横看成岭侧成峰";
        // 创建需要校验的字符串
        boolean value = checkStringOr(string, str -> string.length() > 51, str -> string.contains("横"));
        // 使用lambda表达式并返回检验信息
        System.out.println("value = " + value);
        // 输出校验后的状态信息
    }

    /**
     * @param string     需要检验的字符串
     * @param predicate1 第一个拼接的接口
     * @param predicate2 第二个拼接的接口
     * @return 判断后的状态
     */
    public static boolean checkStringOr(String string, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.or(predicate2).test(string);
        // 这是调用链接后的校验方法
    }

    @Test
    public void test3() {
        String string = "横看成岭侧成峰";
        // 创建需要校验的字符串
        boolean value = checkStringNegate(string, str -> string.length() > 51);
        // 使用lambda表达式并返回检验信息
        System.out.println("value = " + value);
        // 输出校验后的状态信息
    }

    /**
     * @param string     需要检验的字符串
     * @param predicate1 第一个拼接的接口
     * @return 判断后的状态
     */
    public static boolean checkStringNegate(String string, Predicate<String> predicate1) {
        return predicate1.negate().test(string);
        // 这是调用链接后的校验方法
    }

    @Test
    public void test4() {
        String[] strings = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男", "赵丽颖,女"};

        ArrayList<String> arrayList = grepString(strings, str -> str.split(",")[0].length() == 4, str -> "女".equals(str.split(",")[1]));

        for (String s : arrayList) {

            System.out.println("s = " + s);
        }
    }


    public ArrayList<String> grepString(String[] string, Predicate<String> predicate1, Predicate<String> predicate2) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : string) {

            if (predicate1.and(predicate2).test(s)) {

                arrayList.add(s.replace(",","+"));

            }
        }
        return arrayList;
    }
}
