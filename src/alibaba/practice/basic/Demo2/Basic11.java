package alibaba.practice.basic.Demo2;

import alibaba.practice.primary.Demo2.Primary03;

import java.io.*;

/**
 * @program: Java workspace
 * @description: 在电脑D盘下创建一个文件为HelloWorld.txt文件，
 *              判断他是文件还是目录，在创建  一个目录IOTest,
 *              之后将HelloWorld.txt移动到IOTest目录下去；
 *              之后遍历IOTest这个目录下的文件
 * @author: Typhoon
 * @create: 2020-02-05 14:23
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic11 {


    public static void main(String[] args) {
        File file = new File("D:\\");
        showFiles(file);
    }

    /**
     * 查看文件及子文件夹下的文件
     * @param file  需要遍历的文件夹目录
     */
    public static void showFiles(File file){
        File [] files = file.listFiles();
        if (files!=null){
            for (File value : files) {
                if (value.isDirectory()) {
                    showFiles(new File(value.getAbsolutePath()));
                }
                if (value.isFile()) {
                    System.out.println(value.getName());
                }
            }
        }
    }

    /**
     * 复制文件
     * @param startFile 起始文件
     * @param endFile 复制到的文件位置
     */
    public static boolean copyFile(File startFile,File endFile){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        boolean message;
        try {
            fileInputStream = new FileInputStream(startFile.getAbsolutePath());
            fileOutputStream = new FileOutputStream(endFile.getAbsolutePath());
            int value;
            byte[]bytes = new byte[8*1024];
            while((value = fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(value);
            }
            message = true;
        } catch (IOException e) {
            e.printStackTrace();
            message = false;
        }finally {
            Primary03.CloseResource(fileInputStream, fileOutputStream);
        }
        return message;
    }
}
