package alibaba.preview.demo2;

import java.io.InputStream;
import java.lang.reflect.Method;
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
    private static Properties properties;

    private static Class<?> loadClassFile(String configName) throws Exception {
        properties = new Properties();
        // 创建配置文件对象
        InputStream inputStream = HomeWork01.class.getResourceAsStream(configName);
        // 创建输入流，通过反射机制，获取配置文件
        properties.load(inputStream);
        // 加载配置文件
        return Class.forName(properties.getProperty("ClassFullName"));
        // 通过反射获取类对象
    }

    /**
     * @param configName 配置文件名称
     * @throws Exception 可能出现的异常
     */
    static void generalTest(String configName) throws Exception {
        Class<?> aClass = loadClassFile(configName);
        // 通过反射获取类对象
        Object o = aClass.newInstance();
        // 获取的通过构造方法创建对象
        Method methodName = aClass.getDeclaredMethod(properties.getProperty("MethodName"));
        // 加载方法，并获取一个参数
        methodName.setAccessible(true);
        // 进行暴力反射，可直接调用私有方法
        methodName.invoke(o);
        // 调用方法，获取参数
    }

    /**
     * @param configName 配置文件名称
     * @throws Exception 可能出现的异常
     */
    static void generalTest(String configName, Object object1) throws Exception {
        Class<?> aClass = loadClassFile(configName);
        // 通过反射获取类对象
        Object o = aClass.newInstance();
        // 获取的通过构造方法创建对象
        Method methodName = aClass.getDeclaredMethod(properties.getProperty("MethodName"), object1.getClass());
        // 加载方法，并获取一个参数
        methodName.setAccessible(true);
        // 进行暴力反射，可直接调用私有方法
        methodName.invoke(o, properties.getProperty("args1"));
        // 调用方法，获取参数
    }

    /**
     * @param configName 配置文件名称
     * @throws Exception 可能出现的异常
     */
    static void generalTest(String configName, Object object1,Object object2) throws Exception {
        Class<?> aClass = loadClassFile(configName);
        // 通过反射获取类对象
        Object o = aClass.newInstance();
        // 获取的通过构造方法创建对象
        Method methodName = aClass.getDeclaredMethod(properties.getProperty("MethodName"), object1.getClass(),object2.getClass());
        // 加载方法，并获取一个参数
        methodName.setAccessible(true);
        // 进行暴力反射，可直接调用私有方法
        methodName.invoke(o, Integer.valueOf(properties.getProperty("args1")),properties.getProperty("args2"));
        // 调用方法，获取参数
    }
}