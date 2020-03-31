package alibaba.research.demo02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *  Java 内置的4大核心函数式接口
 *      消费型接口 Consumer<T> void accept(T t)
 *      供给型接口 Supplier<T> T get()
 *      函数型接口 Function<T,R> R apply(T,t)
 *      断定型接口 Predicate<T> boolean test(T t)
 *
 * @program: Java workspace
 * @description: 测试lambda
 * @author: typhoon
 * @create: 2020-03-31 19:42
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/
public class LambdaTest {

    /**.
     * 测试消费型函数式接口
     */
    @Test
    public void test1(){
        happyTime(500.00, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                // 重写accept方法
                System.out.println("学习太累了，去天上人间买了瓶矿泉水，价格为："+aDouble);
            }
        });

        System.out.println("**************************");

        happyTime(500,money -> System.out.println("money = " + money));
        // 使用lambda表达式，调用消费型接口Consumer<Double>
    }


    /**.
     * 测试消费型函数式接口
     * @param money 消费金额
     * @param consumer 消费型接口
     */
    public void happyTime(double money, Consumer<Double> consumer){
        // 创建调用的中间方法
        consumer.accept(money);
        // 通过函数式接口调用方法，并传递参数
    }

    /**.
     * 测试断言式接口
     */
    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
        // 创建源列表
        List<String> filterString = filterString(list, new Predicate<String>() {
            // 创建返回值的列表，提供遍历
            @Override
            public boolean test(String s) {
                // 重写test方法
                return s.contains("京");
                // 判断是否包含指定字符
            }
        });

        System.out.println(filterString);
        // 遍历list集合

        System.out.println("**********************");

        List<String> filterString1 = filterString(list,s -> s.contains("京"));
        // 调用过滤方法，使用lambda表达式，传递参数，并判断是否符合条件，符合条见就添加到list集合中
        System.out.println(filterString1);
        // 遍历过滤后的字符串集合
    }


    /**.
     * @param list 原始数据集合
     * @param predicate 断言式接口
     * @return 一个新的集合
     */
    public List<String> filterString(List<String> list, Predicate<String> predicate){
        // 创建过滤方法，传递集合，并添加断言式接口
        ArrayList<String> filterList = new ArrayList<>();
        // 创建一个新的集合，用于存储数据
        for (String s:list) {
            // 使用新循环遍历集合
            if (predicate.test(s)){
                // 调用规则
                filterList.add(s);
                // 符合要求，就添加元素到集合中
            }
        }
        return filterList;
        // 返回最后的集合
    }
}
