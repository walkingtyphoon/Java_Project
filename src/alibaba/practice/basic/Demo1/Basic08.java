package alibaba.practice.basic.Demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: Java workspace
 * @description: 写入数组到文件
 * @author: Typhoon
 * @create: 2020-02-05 13:34
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic08 {
    /**
     * 编写一个 Java 程序将当 100,101,102,103,104,105 个数以数组的形式写入到 Dest.txt
     * 文件中，并以相反的顺序读出显示在屏幕上。（文件）
     * @param args 主方法的参数
     */
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\Dest.txt",true);
            int [] arr = {100,101,102,103,104,105};
            for (int value : arr) {
                fileOutputStream.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
