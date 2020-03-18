package the.calf.is.growing.Demo1;

/**
 * @program: Java workspace
 * @description: 计算内存消耗
 * @author: Typhoon
 * @create: 2020-02-11 20:07
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestMemory {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long startMemory = runtime.freeMemory();
        // 计算开始时的内存
        long endMemory = runtime.freeMemory();
        System.out.println("起始的内存为："+startMemory);
        System.out.println("结束时的内存为："+endMemory);
        System.out.println("内存消耗为："+(startMemory-endMemory)+"k");
    }
}
