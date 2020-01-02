package com.jimmysun.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex07b {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
//				StdOut.print(i);
//				StdOut.println(j);
				sum++;
			}
		}
		StdOut.println(sum);
	}

	private static Object Stringof(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
