package alibaba.practice.basic.Demo4;

/**
 * @program: Java workspace
 * @description: 练习格式化输出
 * @author: Typhoon
 * @create: 2020-02-09 17:39
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic35 {
    public static void main(String[] args) {
        System.out.printf("%c",96);
        // 转化为char值
        System.out.printf("%d",1);
        // 转化为int类型的值
        System.out.printf("%f",1.00);
        // 转化为float类型的数值
        System.out.printf("%s","sadfasd121");
        // 转化数据为字符串
        System.out.printf("%6d",12);
        // 输出的int类型占指定的列
        System.out.printf("%6.2f",123.5986644);
        // 输出浮点类型的指定位置，保留指定位数

    }
}
