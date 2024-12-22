package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 class PredicateTest2 {

	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<>();
		Employee o1 = new Employee("ajay",32);
		Employee o2 = new Employee("shikha",15);
		empl.add(o1);
		empl.add(o2);
		Predicate<Employee> p = (x) -> x.getAge() > 10;
		if(p.test(new Employee("Rajput", 25)))
			System.out.println("employee age is greather than 10");
	}

}
