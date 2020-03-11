package alibaba.preview.demo2;

import java.io.InputStream;
import java.util.Properties;

/**
 * @program: Java workspace
 * @description: 需求：写一个"框架"，不能改变该类的任何代码的前提下，
 *              可以帮我们创建任意类的对象，并且执行其 中任意方法
 *              实现：
 *                  1. 配置文件
 *                  2. 反射
 *              步骤：
 *                  1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 *                  2. 在程序中加载读取配置文件
 *                  3. 使用反射技术来加载类文件进内存
 *                  4. 创建对象
 *                  5. 执行方法
 * @author: Typhoon
 * @create: 2020-03-11 18:35
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class HomeWork01 {
    public static void main(String[] args) {
        try {
            readFile("conf.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param configName 配置文件名称
     * @throws Exception 可能出现的异常
     */
    static void readFile(String configName) throws Exception {
        Properties properties = new Properties();
        // 创建配置文件对象
        InputStream inputStream = HomeWork01.class.getResourceAsStream(configName);
        // 创建输入流，通过反射机制，获取配置文件
        properties.load(inputStream);
        // 加载配置文件
        Class<?>  aClass = Class.forName(properties.getProperty("ClassFullName"));
        // 通过反射获取类对象
    }
}
