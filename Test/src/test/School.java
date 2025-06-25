package test;

public class School {
	private int num_of_students;
	private String name;

	public School(String name, int num_of_students) {
		this.name = name;
		this.num_of_students = num_of_students;
	}

	public int getNumOfStudents() {
		return this.num_of_students;
	}

	public String getName() {
		return this.name;
	}
}
