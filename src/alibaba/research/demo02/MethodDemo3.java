package alibaba.research.demo02;

/**
 * @program: Java workspace
 * @description: 练习方法的新的方法调用
 * @author: typhoon
 * @create: 2020-04-06 19:34
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class MethodDemo3 {
    static long aLong;
    public static void main(String[] args) {
        long l = countValue(() -> 12L * 14L);
        long l1 = countValue(() -> 12L + 14L);
        System.out.println("l = " + l);
        System.out.println("l1 = " + l1);
    }

    public static long countValue(LongCount<Long,Long> longCount) {
        return longCount.apply();
    }
}

@FunctionalInterface
interface LongCount<T,R> {

    /**
     * @return 对应类型的值
     */
    R apply();
}