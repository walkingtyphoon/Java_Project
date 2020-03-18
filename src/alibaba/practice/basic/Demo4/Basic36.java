package alibaba.practice.basic.Demo4;

import java.util.StringTokenizer;

/**
 * @apiNote 练习StringTokenizer，
 *          使用的方法有：
 *                  统计字符串个数 countTokens();
 *                  询问是否存在字符串 hasMoreTokens()
 *                  拿出字符串：nextToken()
 *           使用技巧：
 *              1、可以搭配正则表达式，简化格式，方便操作
 *              2、可以将字符串解析为需要的类型进行操作
 *                 需要调用对应数据类型的解析方法
 * @program: Java workspace
 * @description: 清华大学学习笔记练习
 * @author: Typhoon
 * @create: 2020-02-09 18:01
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic36 {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("123*456*789*","*");
        int sum = stringTokenizer.countTokens();
        System.out.println("大约有"+sum+"个字符串");
        int value;
        while (stringTokenizer.hasMoreTokens()){
            String s = stringTokenizer.nextToken();
            value = Integer.parseInt(s);
            sum += value;
        }
        System.out.println("还有："+sum+"个数");
        System.out.println("求得数字的总和是："+sum);
    }
}
