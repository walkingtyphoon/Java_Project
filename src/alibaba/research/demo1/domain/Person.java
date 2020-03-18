package alibaba.research.demo1.domain;

/**
 * @program: Java workspace
 * @description: 反射实体类
 * @author: Typhoon
 * @create: 2020-03-07 11:33
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Person {
    public String value1 ="大数据";
    protected String value2;
    private String value3;
    String value4;
    private int id;
    private String name;

    public Person() {
    }

    private Person(int id){
        this.id = id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    @Override
    public String toString() {
        return "Person{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private void eat(String food){
        System.out.println("Today i want to eat fish");
    }

    public void eat(){
        System.out.println("eat");
    }
}
