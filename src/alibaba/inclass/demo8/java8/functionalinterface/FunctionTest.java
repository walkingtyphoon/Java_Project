package alibaba.inclass.demo8.java8.functionalinterface;

import org.junit.Test;

import java.util.function.Function;

/**
 * @program: Java workspace
 * @description: 练习Function
 * @author: typhoon
 * @create: 2020-04-08 16:46
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class FunctionTest {

    /**
     * 测试方法
     */
    @Test
    public void test1() {
        String string = "迪丽热巴,20";
        // 原始字符串
        int value = cycleAdd(string, str -> Integer.parseInt(str.split(",")[1]), i -> i + 100);
        // 使用表达式求出计算后的结果
        System.out.println("value = " + value);
        // 输出计算后的结果
    }


    /**
     * .
     *
     * @param string    目标字符串
     * @param function1 进行转化字符串的函数式接口
     * @param function2 进行累加的函数式接口
     * @return 计算后的结果
     */
    public int cycleAdd(String string, Function<String, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(string);
        // 链接两个接口，并操作字符串
    }


}
