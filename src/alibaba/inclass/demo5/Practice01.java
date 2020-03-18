package alibaba.inclass.demo5;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @program: Java workspace
 * @description: 学习Java8的新特性
 * @author: Typhoon
 * @create: 2020-02-29 12:36
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Practice01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 获取时间
        LocalDate localDate = localDateTime.toLocalDate();
        // 获取日期
        int year = localDateTime.getYear();
        // 获取年
        int month = localDateTime.getMonthValue();
        // 获取月
        int day = localDateTime.getDayOfMonth();
        // 获取日
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second =  localDateTime.getSecond();
        System.out.println("现在是："+year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
    }
}
