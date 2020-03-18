package alibaba.inclass.demo7;

/**
 * @program: Java workspace
 * @description: the file is homework
 * @author: Typhoon
 * @create: 2020-03-11 18:39
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Person {
    private int id;
    public String name;

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("我想吃水果");
    }

    public void eat(String foodName){
        System.out.println("i want eat "+foodName);
    }

    public void eat(Integer value,String name){
        System.out.println("我想吃"+value+"个"+name);
    }
}
