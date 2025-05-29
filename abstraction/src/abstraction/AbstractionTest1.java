package abstraction;

public abstract class AbstractionTest1 {
	int age;
	String name;
	public AbstractionTest1(){
		
	}
	public AbstractionTest1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "AbstractionTest1 [age=" + age + ", name=" + name + "]";
	}

}
