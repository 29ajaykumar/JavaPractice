package test;


import java.util.Comparator;

public class SortSchools implements Comparator<School> {
	@Override
	public int compare(School sch1, School sch2) {
		if (sch1.getNumOfStudents() == sch2.getNumOfStudents())
			return 0;
		else
			return sch1.getNumOfStudents() > sch2.getNumOfStudents() ? 1 : -1;
	}

	public static void main(String[] args) {
		School sch1 = new School("sch1", 20);
		School sch2 = new School("sch2", 15);
		SortSchools sortSch = new SortSchools();
		int retval = sortSch.compare(sch1, sch2);
		switch (retval) {
		case -1: {
			System.out.println("The " + sch2.getName() + " is bigger!");
			break;
		}
		case 1: {
			System.out.println("The " + sch1.getName() + " is bigger!");
			break;
		}
		default:
			System.out.println("The two schools are of the same size!");
		}
	}


}
