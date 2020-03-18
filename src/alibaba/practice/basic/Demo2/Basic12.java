package alibaba.practice.basic.Demo2;

import java.util.Scanner;

/**
 * @program: Java workspace
 * @description: 测试朋友代码
 * @author: Typhoon
 * @create: 2020-02-08 09:41
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value;
        int excellent = 0;
        // 设置统计优秀变量
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"个同学的成绩为");
            value=sc.nextInt();
            if (value<0 || value >100){
                // 逆向对立情况
                System.out.println("输入有误，请重新输入");
                i=1;
                // 错误操作就重置次数
            }

            if (value >= 80 && value <= 100){
                // 符合要求
                excellent++;
                // 优秀变量自增
            }else{
                System.out.println("成绩待定");
                // 测试目的，其余默认待定，自由发挥
            }
        }
        System.out.println("统计结果显示：\n优秀："+excellent);
        // 输出统计后的结果
    }
}
