package alibaba.math.basic.Demo1;

/**.
 * @program: Java workspace
 * @description: 练习求指定数的乘方，也就是次幂
 * @author: Administrator
 * @create: 2020-04-11 22:33
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/
public class Basic1 {

    /**.
     * @param args 主方法的参数值
     */
    public static void main(String[] args) {
        double pow = Math.pow(-11, 3);
        // 求底数为-11,指数为3的次幂
        System.out.println("pow = " + pow);
        // 输出计算后的次幂值

        double pow1 = Math.pow(2, 3);
        // 求底数为2,指数为3的次幂
        System.out.println("pow1 = " + pow1);
        // 输出求得的值
        System.out.println("println(\"hello,world!\\n\");");
    }
}
