package alibaba.research.encryption;

/**
 * @program: Java workspace
 * @description: 练习Java8接口中的默认方法
 * @author: Typhoon
 * @create: 2020-02-28 13:00
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestJava8Interface implements Java8Interface{
    @Override
    public void show() {
        Java8Interface.super.show();
        // 调用Java8中的默认方法
    }

    public static void main(String[] args) {
        TestJava8Interface testJava8Interface = new TestJava8Interface();
        testJava8Interface.show();
    }
}
