package alibaba.research.encryption;

import java.util.Arrays;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 测试新的方法调用
 * @author: Typhoon
 * @create: 2020-02-28 07:59
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestNewMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(s -> System.out.println("s = " + s));
        // 调用构造方法,也可以调用静态方法
    }
}
