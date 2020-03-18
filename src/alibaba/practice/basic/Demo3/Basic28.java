package alibaba.practice.basic.Demo3;

/**
 * @program: Linux_WorkSpace_Eclipse
 * @description: 测试打印九九乘法口诀表
 * @author: Typhoon
 * @create: 2020-01-23 12:55
 **/
public class Basic28 {
    /**
     * 需要打印的最大序列
     */
    static final int MAX = 9;

    public static void main(String[] args) {
    printTable();
    }

    /**
     *
     */
    private static void printTable(){
        for (int j = 1; j <= MAX; j++) {
            System.out.println();
            for (int k = 1; k <= j; k++) {
                System.out.print(k+"*"+j+"="+k*j+" ");
            }
        }
    }
}