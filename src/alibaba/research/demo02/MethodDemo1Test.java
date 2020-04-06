package alibaba.research.demo02;

import alibaba.research.demo1.domain.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: Java workspace
 * @description: 练习方法的引用
 * @author: typhoon
 * @create: 2020-04-06 17:38
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class MethodDemo1Test {


    /**
     * .
     * 练习数组的方法引用
     */
    @Test
    public void testDemo1() {
        Function<Integer, String[]> function = x -> new String[x];
        // 测试数组的方法的引用基础型
        String[] apply = function.apply(10);
        // 返回值为一个数组
        System.out.println("apply = " + apply.length);
        // 输出实例化的数组长度
        Function<Integer, String[]> function1 = String[]::new;
        // 使用新方法引用创建数组
        String[] apply1 = function1.apply(20);
        // 调用函数接口的特有方法
        System.out.println("apply1.length = " + apply1.length);
        // 输出获取到的长度
    }

    /**
     * 练习Comparator比较器的方法引用
     */
    @Test
    public void testDemo2() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        // 比较
        Comparator<Integer> comparator1 = Integer::compareTo;
    }


    @Test
    public void testDemo3(){
        BiPredicate<String,String> biPredicate = (x,y) -> x.equals(y);
        // 练习实例方法的调用
        BiPredicate<String,String> biPredicate1 = String::equals;
        // 使用新的方法调用
        boolean a = biPredicate1.test("a","b");
        // 测试字符串
        System.out.println("a = " + a);
    }

    @Test
    public void testDemo4(){
        Supplier<Person> supplier = () -> new Person();

        Supplier<Person> supplier1 = Person::new;

    }
}
