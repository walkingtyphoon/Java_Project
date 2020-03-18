package alibaba.research.encryption;

import java.util.*;

/**
 * @program: Java workspace
 * @description: 练习stream
 * @author: Typhoon
 * @create: 2020-02-28 07:03
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Stream01 {
    public static void main(String[] args) {
        Random random = new Random();
        // 创建随机数对象
        random.ints().limit(10).sorted().forEach(System.out::println);
        // 生成随机数，10个，排序后，遍历，通过类调用，前边是类，后边是方法



        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,8,52,3,4,2,1,3);
        list.forEach(System.out::println);
    }
}
