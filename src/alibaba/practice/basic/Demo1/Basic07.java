package alibaba.practice.basic.Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: Java workspace
 * @description: 练习读取文件
 * @author: Typhoon
 * @create: 2020-02-05 13:23
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic07 {
    /**
     * 应用 FileInputStream 类，编写应用程序，从磁盘上读取一个 Java 程序，并将源程序代
     * 码显示在屏幕上。（被读取的文件路径为：E:/java/Hello.java）
     * @param args 主方法的参数
     */
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\File_System\\Personal_Affairs\\Java workspace\\src\\alibaba\\practice\\basic\\basic07.java");
            int length;
            byte [] bytes = new byte[1024];
            while((length= fileInputStream.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
