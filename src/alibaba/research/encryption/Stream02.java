package alibaba.research.encryption;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Java workspace
 * @description: 练习Java8新特性
 * @author: Typhoon
 * @create: 2020-02-28 08:05
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Stream02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(String::isEmpty).count();
        // 调用集合，使用流对象，设置约束条件，使用条件，进行统计返回结果
        count = strings.stream().filter(string->string.lastIndexOf('a')!=-1).count();
        //                                      可以加入一定的判断条件进行统计
        strings = strings.stream().filter(String::isEmpty).collect(Collectors.toList());
        // 使用收集器，然后使用流对象转化为list
        String string = strings.stream().filter(String::isEmpty).collect(Collectors.joining(","));
        // 使用流将指定数据拼接成字符串
        System.out.println(string);
    }
}
