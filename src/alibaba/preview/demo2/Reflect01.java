package alibaba.preview.demo2;

public class Reflect01{

	public static void main(String[]args) throws ClassNotFoundException {
	Class<?> classs = Class.forName("Person");
	System.out.println(classs);
	}

}
