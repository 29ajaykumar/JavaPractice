package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

 class FunctionTest1 {
//2971-2279-325+2901-665+3642+1897+1068-4926+1917
	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<>();
		Employee o1 = new Employee("ajay",32.00);
		Employee o2 = new Employee("shikha",15.00);
		empl.add(o1);
		empl.add(o2);
		Function<Employee,Employee> f = (i)->{
			i.setSalary(i.getSalary()+10);
			return i;
		};
		System.out.println(o1);
		System.out.println(o2);
		
		f.apply(o1);
		f.apply(o2);
		
		System.out.println(o1);
		System.out.println(o2);
	}

}
