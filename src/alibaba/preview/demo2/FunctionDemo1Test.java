package alibaba.preview.demo2;

import org.junit.Test;
import java.util.function.Consumer;

/**
 * @program: Java workspace
 * @description: 练习consumer接口
 * @author: typhoon
 * @create: 2020-04-08 11:08
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class FunctionDemo1Test {

    @Test
    public void consumerTest(){
        happy(200.00,money -> System.out.println("买零食花了: " + money));
    }

    /**
     * @param money 消费的金额
     * @param consumer 消费型接口
     */
    public void happy(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
}
