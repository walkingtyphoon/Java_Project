package alibaba.research.encryption;

import java.util.Scanner;

/**
 * @apiNote 静态代码块-->main方法的代码-->构造代码块-->构造方法-->顺序执行代码（或同步代码块）
 * @program: Java workspace
 * @description: 清华大学学习笔记练习
 * @author: Typhoon
 * @create: 2020-02-09 18:01
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Beaver extends PasswordTemplate{
    /**
     * 加密的参考字符
     */
    private static char value;

    /**
     * 扫描键盘
     */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * 定义String的最大长度
     */
    private static final int MAXSTRING = 40960;

    /**
     * 设置空字符串
     */
    private static final String NESTING = "\"\"";

    /**
     * 定义控制的方法
     */
    private void show(){
        cryptographicparadigm();
        String string;
        // 需要操作的字符串
        int value;
        // 录入选项
        w:while (true) {
            System.out.println("请输入你需要的操作：" +
                    "\n1、加密" +
                    "\n2、解密" +
                    "\n3、结束");
            value = SCANNER.nextInt();
            // 录入数字
            switch (value) {
                case 1:
                    System.out.println("请输入你需要加密的文字：");
                    string = inputData();
                    // 录入操作字符串
                    System.out.println(encryption(string));
                    // 操作字符串进行加密
                    break;
                case 2:
                    System.out.println("请输入你需要解密的文字：");
                    string = inputData();
                    System.out.println(decrypt(string));
                    // 调用解密的方法
                    break;
                case 3:
                    System.out.println("系统退出中，感谢使用");
                    break w;
                default:
                    System.out.println("输入有误，进程结束");
                    break w;
            }
        }
    }

    /**
     * 解密操作
     * @param string 需要解密的数据
     * @return 解密后的数据
     */
    @Override
    public StringBuilder decrypt(String string) {
        System.out.print("解密后的原文为：");
        return passwordOperation(string);
    }

    @Override
    public void cryptographicparadigm() {
        value = 'S';
    }

    /**
     * 加密操作
     * @param string 需要加密的数据
     * @return 加密后的数据
     */
    @Override
    public StringBuilder encryption(String string) {
        System.out.print("密文：");
        return passwordOperation(string);
    }

    /**
     * 传输数据
     * @return 录入的字符串
     */
    private String inputData(){
        String value = SCANNER.next();
        if (NESTING.equals(value)){
            System.out.println("输入的字符串为空");
            System.exit(0);
        }
        if (MAXSTRING<value.length()){
            System.out.println("输入字符串过长");
            System.exit(0);
        }
        return value;
    }

    /**
     *加解密数据
     * @param string 需要加解密的字符出串信息
     * @return 加密的数据
     */
    private StringBuilder passwordOperation(String string){
        StringBuilder str = new StringBuilder();
        char []chars = string.toCharArray();
        for (char c:chars) {
            c = (char)(c^value);
            str.append(c);
        }
        return str;
    }
}
