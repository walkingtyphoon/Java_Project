package alibaba.inclass.demo8.java8.functionalinterface;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @program: Java workspace
 * @description: 练习供给型接口
 * @author: typhoon
 * @create: 2020-04-01 10:05
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 * todo:Java获取数组最大值
 **/

public class SupplierTest {

    public static void main(String[] args) {
        String showString = show(() -> "大数据");
        System.out.println("showString = " + showString);
    }

    @Test
    public void MaxIntegerTest() {
        int[] arr = {1, 2, 3, 4, 56};
        int max = getMaxInteger(arr, () -> {
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
        System.out.println(max);
    }


    public static String show(Supplier<String> supplier) {
        return supplier.get();
    }

    public static int getMaxInteger(int[] arr, Supplier<Integer> supplier) {
        return supplier.get();
    }
}

