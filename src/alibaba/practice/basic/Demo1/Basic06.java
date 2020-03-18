package alibaba.practice.basic.Demo1;

import java.util.Scanner;

/**
 * @program: Java workspace
 * @description: 数据类型拼接
 * @author: Typhoon
 * @create: 2020-02-05 12:57
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic06 {
    /**
     * 实例化键盘录入对象
     */
    static final Scanner SCANNER =new Scanner(System.in);
    /**
     * 编写一个 Java 应用程序，从键盘读取用户输入两个字符串，并重载 3 个函数分别实现
     * 这两个字符串的拼接、整数相加和浮点数相加。要进行异常处理，对输入的不符合要求
     * 的字符串提示给用户，不能使程序崩溃。（异常处理）
     * @param args 主方法的参数
     */
    public static void main(String[] args) {
    }

    /**
     *
     * @param string1 拼接的第二个字符串
     * @param string2 拼接的第二个字符串
     * @return 拼接好的字符串
     */
    static String splicing(String string1,String string2){
        if (string1 == null | string2 == null){
            throw new NullPointerException("你的字符串为空");
        }
        return string1+string2;
    }

    static int splicing(int i,int j){
        return i+j;
    }

    static double splicing(double d,double b){
        return d+b;
    }
}
