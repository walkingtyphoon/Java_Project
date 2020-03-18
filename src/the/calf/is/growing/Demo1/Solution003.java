package the.calf.is.growing.Demo1;

/**
 * @program: Java workspace
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。
 *              求base的exponent次方。  
 *              保证base和exponent不同时为0
 * @author: Typhoon
 * @create: 2020-02-11 19:44
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Solution003 {
    public double Power(double base, int exponent) {
        double d;
        if (base == 0 && exponent == 0){
            System.out.println();
            System.exit(0);
        }
        d = Math.pow(base,exponent);
        return d;
    }
}
