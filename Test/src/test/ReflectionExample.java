package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
 interface Pair<K, V,X,T> {
    K getKey();
    V getValue();
}
class Person {
	private String name = "John";
	public int age = 30;

	public void sayHello() {
		System.out.println("Hello!");
	}

	private void secret() {
		System.out.println("This is a secret method.");
	}
}

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		// Load class dynamically
		Class<?> clazz = Class.forName("test.Person");

		// Create instance
		Object person = clazz.getDeclaredConstructor().newInstance();

		// Access public field
		Field ageField = clazz.getField("age");
		System.out.println("Age: " + ageField.get(person));

		// Access private field
		Field nameField = clazz.getDeclaredField("name");
		nameField.setAccessible(true); // allows access to private field
		System.out.println("Name: " + nameField.get(person));

		// Invoke public method
		Method sayHello = clazz.getMethod("sayHello");
		sayHello.invoke(person);

		// Invoke private method
		Method secret = clazz.getDeclaredMethod("secret");
		secret.setAccessible(true); // allows calling private method
		secret.invoke(person);
	}
}
