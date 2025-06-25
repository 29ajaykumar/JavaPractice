package staticInitializerBlock;

interface I {

	public static void foo() {
		{
			System.out.println("foo 1");
		}
		System.out.println("interface StaticInitializerBlock");
		{
			System.out.println("foo 2");
		}
	}
}
/**
 * this could run before java 1.6
 */
public class StaticInitializerBlock2 {
	public static void main(String[] args) {
		I.foo(); 
	}
}
