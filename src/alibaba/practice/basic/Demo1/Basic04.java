package alibaba.practice.basic.Demo1;

import java.util.Scanner;

/**
 * @program: Java workspace
 * @description: 练习switch语句
 * @author: Typhoon
 * @create: 2020-02-04 13:52
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic04 {
    static final Scanner SCANNER = new Scanner(System.in);
    /**
     * 实现会员注册，要求用户名长度不小于 3，密码长度不小于 6，注册时两次输入密码必
     * 须相同 （字符串）
     * @param args 主函数的参数
     */
    public static void main(String[] args) {
        System.out.println("请输入你的用户名:");
        String id = SCANNER.nextLine();
        System.out.println("请输入你的密码:");
        String password = SCANNER.nextLine();
        System.out.println("请输入你的密码:");
        String secondpassword = SCANNER.nextLine();
        if (!"".equals(id)&&!"".equals(password)&&!"".equals(secondpassword)){
            if (id.length()>6 && password.length()>6 && secondpassword.length()>6){
                if (password.equals(secondpassword)){
                    System.out.println("登录成功");
                }else{
                    System.out.println("两次密码输入必须一致");
                }
            }else{
                throw new StringIndexOutOfBoundsException("输入长度有误");
            }
        }else{
            throw new NullPointerException("输入为空");
        }
    }
}
