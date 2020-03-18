package alibaba.research.encryption;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 练习Java8的新特性
 * @author: Typhoon
 * @create: 2020-02-28 08:44
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Stream04 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        // 创建集合
        IntSummaryStatistics intSummaryStatistics = integers.stream().mapToInt((x)->x).summaryStatistics();
        // 使用专用函数，流，将值转化为int类型，进行总结
        int value = intSummaryStatistics.getMax();
        // 求得最大值
        System.out.println(value);
        value = intSummaryStatistics.getMin();
        System.out.println(value);
        double d = intSummaryStatistics.getAverage();
        System.out.println(d);
        long v = intSummaryStatistics.getSum();
        System.out.println(v);
        v = intSummaryStatistics.getCount();
        System.out.println(v);

    }
}
