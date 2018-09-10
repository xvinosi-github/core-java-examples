package org.vinod.corejava.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Solution s = new Solution();
		for (int tItr = 0; tItr < t; tItr++) {
			String expression = scanner.nextLine();
			s.checkExpression(expression);
		}

		scanner.close();
	}

	public void checkExpression(String expression) {
		Stack<Character> s = new Stack<Character>();
		char[] cArray = expression.toCharArray();
		for (char c : cArray) {
			if (!s.isEmpty()) {
				char c1 = s.peek().charValue();
				if (c1 == c) {
					s.pop();
				} else {
					s.push(c);
				}
			} else {
				s.push(c);
			}
		}
		if (s.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
