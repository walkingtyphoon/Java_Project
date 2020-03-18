package alibaba.research.encryption;

/**
 * @program: Java workspace
 * @description: 测试lambda表达式
 * @author: Typhoon
 * @create: 2020-02-28 13:09
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestLambda01{
    public static void main(String[] args) {

        // 不是lambda表达式
        Object object = new Lambda01() {
            @Override
            public int show(int i, int j) {
                return 0;
            }
        };

        Lambda01 lambda01 = Integer::sum;
        //  使用lambda表达式，调用integer中的静态方法进行求和
        int x = lambda01.show(1,2);
        // 获取其结果
        System.out.println(x);


        Lambda01 lambda011 = (i,j) -> {return i*j;};
        /* 使用表达式可以进行惭怍，括号中是方法的参数，后者看可以加入表达式或者是语句，
        括号中的参数可以是无类型的,可以不带括号，可以带括号
        * */
        System.out.println("1*1="+operator(1,1,lambda011));


        Lambda02 lambda02 = System.out::print;
        // 测试无返回值的表达式
        lambda02.print("Asd");
        // 调用方法可直接输出，只需要给参数，然后就可以使用接口换的方法进行调用
    }
    public static int operator(int i,int j,Lambda01 lambda01){
        // 借助方法，获取值
        return lambda01.show(i,j);
    }
}
