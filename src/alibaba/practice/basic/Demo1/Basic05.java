package alibaba.practice.basic.Demo1;

/**
 * @program: Java workspace
 * @description: 计算字符串碎片
 * @author: Typhoon
 * @create: 2020-02-04 15:52
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic05 {
    public static void main(String[] args) {
        System.out.println(sumStringFragMent("aaabbaaac"));
    }

    /**
     * @param string 需要格式化的字符串
     * @return 字符串碎片的平均值
     */
    static double sumStringFragMent(String string){
        char[] chars = string.toCharArray();
        // 将字符串转化为char数组
        char c = chars[0];
        // 将第一个字符设置为起始对比字符串
        int sum = 1;
        // 统计字符串出现的次数
        for (char aChar : chars) {
            if (aChar != c) {
                sum++;
                c = aChar;
                // 符合要求就把当前校对的字符串切换为下一个字符
            }
        }
        // 求出当前字符串碎片的平均值
        return (double)string.length() / sum;
    }
}
