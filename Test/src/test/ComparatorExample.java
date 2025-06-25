package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Model Class
class Student {
	int id;
	String name;
	int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return id + " - " + name + " - " + age;
	}
}

// Comparator to sort by Name
class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.name.compareToIgnoreCase(s2.name);
	}
}

// Comparator to sort by Age
class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.age - s2.age;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Zara", 22));
		list.add(new Student(102, "Alice", 19));
		list.add(new Student(103, "Bob", 21));
		list.add(new Student(104, "Bob", 20)); // Added to test tie-breaker

		// Multi-level sort: First by name, then by age
		Comparator<Student> multiSort = new NameComparator().thenComparing(new AgeComparator());
		Collections.sort(list, multiSort);

		System.out.println("Sorted by Name, then by Age:");
		list.forEach(System.out::println);
	}
}
