package alibaba.research.encryption;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Java workspace
 * @description: 学习Java8的新特性
 * @author: Typhoon
 * @create: 2020-02-28 08:38
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Stream03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        // 将集合使用map进行操作，然后进行去重distinct，最后边为集合
        System.out.println(squaresList);
    }
}
