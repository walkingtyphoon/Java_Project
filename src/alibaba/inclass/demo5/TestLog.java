package alibaba.inclass.demo5;

import org.apache.log4j.Logger;

/**
 * @program: Java workspace
 * @description: 测试日志文件
 * @author: Typhoon
 * @create: 2020-02-29 11:20
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestLog {
    private static Logger logger = Logger.getLogger(TestLog.class);
    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }catch (Exception e){
            logger.error("This is warn Message：",e);
        }
    }
}
