package alibaba.preview.demo2;

public class Reflect01 {
  public static void main(String[]args) throws ClassNotFoundException {
    Class<?> aclass = Class.forName("Person");
    System.out.println(aclass);
  }
}
