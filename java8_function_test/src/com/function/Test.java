package com.function;

import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = s -> s + s;
		Function<Integer, Integer> f2 = s -> s * s * s;
		System.out.println("The Result of f1:" + f1.apply(5));
		System.out.println("The Result of f2:" + f2.apply(5));
		System.out.println("The Result of f1.andThen(f2):" + f1.andThen(f2).apply(5));
		System.out.println("The Result of f1.compose(f2):" + f1.compose(f2).apply(5));

	}
}
