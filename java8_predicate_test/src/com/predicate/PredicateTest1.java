package com.predicate;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
		Predicate<Integer> p = (x) -> x > 10;
		System.out.println(p.test(70));
	}

}
