package alibaba.practice.basic.Demo4;

/**
 * @program: Java workspace
 * @description: String str = “t a ren a codetedu a sdfghjkl”; 请统计下列字符串中a字符出现的个数？
 * @author: Typhoon
 * @create: 2020-02-11 18:58
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic38 {
    public static void main(String[] args) {
        String string = "tarenacodeteduasdfghjkl";
        System.out.println(countNumber(string));
    }
    static int countNumber(String string){
        int sum = 0;
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if ('a' == string.charAt(i)){
                sum ++;
            }
        }
        return sum;
    }
}
