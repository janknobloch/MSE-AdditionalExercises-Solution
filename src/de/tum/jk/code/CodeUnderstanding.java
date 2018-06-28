package de.tum.jk.code;

public class CodeUnderstanding {

	public static void main(String[] args) {
		int i = 5;
		int y = i / 3;
		System.out.println(y);
		System.out.println(i % 4);

		int[] array1 = { 1, 5, 3 };
		int[] array2 = { 3, 4, 5 };
		array2 = array1;
		array2[1] = 2;
		System.out.println(array1[1]);
		System.out.println(array2.length);

		int r = 0;
		for (int a = 0; a < 5; a++) {
			r++;
		}
		System.out.println(r);

		boolean result = 5 * 2 > 9;
		if (result) {
			y = 8;
		}
		System.out.println(y);

		String s2 = "GruPro-Exam17";
		int number = s2.toCharArray().length;
		System.out.println(number);

		int count = 42;
		if (count % 3 == 1) {
			count++;
		} else {
			count = count / 2;
		}
		System.out.println(count);

		System.out.println("" + 3 + 4);

		int array3[][] = new int[55][34];
		System.out.println(array3.length);
		System.out.println(array3.length + array3[28].length);

		String s = "1";
		System.out.println(s + 4 + (--i));
	}
}