package alibaba.inclass.demo8.annotation;

import java.lang.reflect.Method;

public class CheckFile {
    public static void main(String[] args) {
        Class<Calculator> class01 = Calculator.class;
        Method[] methods = class01.getMethods();
    }
}
