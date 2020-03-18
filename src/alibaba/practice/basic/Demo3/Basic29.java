package alibaba.practice.basic.Demo3;

/**
 * @author typhoon
 */
public class Basic29 implements Cloneable{

	private int id;
	private String name;
	private int age;



	public Basic29(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public Basic29() {

	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Basic29 other = (Basic29) obj;
		if (age != other.age) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			return other.name == null;
		}else {
			return name.equals(other.name);
		}
	}
	public static void main(String[] args) {
		Basic29 t=new Basic29(1,"LGG",18);
		System.out.println(t);
	}
}
