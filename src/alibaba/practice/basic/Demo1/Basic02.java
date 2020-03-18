package alibaba.practice.basic.Demo1;

/**
 * @program: Java workspace
 * @description: 计算字符串碎片
 * @author: Typhoon
 * @create: 2020-02-04 11:51
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic02 {
    public static void main(String[] args) {
        System.out.println(judgeLeapYear(2100));
    }
    /**
     * 编写一个 Java 程序，用 if-else 语句判断某年份是否为闰年。(分支)
     * 普通闰年:公历年份是4的倍数的，且不是100的倍数，为闰年。（如2004年就是闰年）；
     * 世纪闰年:公历年份是整百数的，必须是400的倍数才是世纪闰年（如1900年不是世纪闰年，2000年是世纪闰年）；
     */
    static boolean judgeLeapYear(int year){
        boolean message = false;
        if (year>0){
            if (year %4 == 0 && year %100!=0){
                message = true;
            }
            if (year %400 == 0){
                message = true;
            }
        }
        return message;
    }
}
