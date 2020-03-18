package alibaba.practice.basic.Demo1;

/**
 * @program: Java workspace
 * @description: 基础练习大小写字符转换
 * @author: Typhoon
 * @create: 2020-02-04 11:06
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic01 {
    /**
     * 有一个字符串”1a2b3d4z”,；
     *
     * 要求写一个函数实现如下功能，
     *
     * 功能1：把偶数位字符挑选出来，组成一个字符串1。value；20分
     *
     * 功能2：把奇数位字符挑选出来，组成一个字符串2，value 20
     *
     * 功能3：把字符串1和字符串2，通过函数参数，传送给main，并打印。
     *
     * 功能4：主函数能测试通过。
     * @param string 需要格式化的字符串
     * @return value1+value2 返回字符串
     */
    static String replaceString(String string){
        StringBuilder value1 = new StringBuilder();
        // 创建准备追加的字符串一
        StringBuilder value2 = new StringBuilder();
        // 创建准备追加的字符串二
        if ("".equals(string)){
            // 判断是否为空
            throw new NullPointerException();
            // 是的话就创建空指针异常
        }

        for (int i = 0; i < string.length(); i++) {
            // 遍历字符串
            if (i %2==0 ){
                // 将当前的索引取余2，如果为0
                value1.append(string.charAt(i));
                // 就将当前字符追加到字符串一
            }else{
                value2.append(string.charAt(i));
                // 否则就追加到字符串二
            }
        }
        return "String 1："+value1+"\nString 2："+value2;
        // 返回两个字符串
    }
}
