package alibaba.inclass.demo8.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 练习使用lambda表达式遍历集合
 * @author: Administrator
 * @create: 2020-03-27 20:53
 *      谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda07 {

    /**.
     * @param args 主方法的参数
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
        // 创建一个list集合
        list.forEach(value -> System.out.println("list = " + value));
        // 便利list的集合

        /*


        for (String s:list) {
            if (predicate.test(s)){
                filterList.add(s);
            }
        }

        */
    }
}
