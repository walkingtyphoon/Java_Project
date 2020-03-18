package alibaba.inclass.demo5;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @program: Java workspace
 * @description: 练习Java8中新时间类
 * @author: Typhoon
 * @create: 2020-02-29 13:11
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Practice02 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("现在的时间是："+localDateTime);
        LocalTime localTime = LocalTime.parse("20:25");
        System.out.println(localTime.getHour()+":"+localTime.getMinute());
    }
}
