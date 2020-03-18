package alibaba.practice.basic.Demo1;

/**
 * @program: Java workspace
 * @description: 计算字符串数字之和
 * @author: Typhoon
 * @create: 2020-02-04 13:49
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic03 {
    /**
     * 编写一个 Java 程序在屏幕上输出 1！+2！+3！+……+10！的和。（循环）
     * @param args 主函数的参数
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("1!+2!+3!+.....+10!="+sum);
    }
}
