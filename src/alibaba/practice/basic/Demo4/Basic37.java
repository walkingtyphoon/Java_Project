package alibaba.practice.basic.Demo4;

import java.time.LocalDateTime;

/**
 * @program: Java workspace
 * @description: 练习最新的Date类
 * @author: Typhoon
 * @create: 2020-02-11 17:55
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic37 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("现在的时间是："+localDateTime);
        System.out.println("现在的年是："+localDateTime.getYear());
        System.out.println("现在的月是："+localDateTime.getMonth());
        System.out.println("现在是当前月的："+localDateTime.getDayOfMonth()+"日");
        System.out.println("现在是当前时的："+localDateTime.getHour());
        System.out.println("现在是："+localDateTime.getHour()+"分");
        System.out.println("现在是："+localDateTime.getHour()+"秒");
    }
}
