package exer;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		String[] str = new String[8];
		for (int j = 1; j <= 8; j++) {
			str[j - 1] = (j+1)+"";
		}
		String str1 = new String();
		String str2 = new String();

		Scanner s = new Scanner(System.in);
		str1 = s.next();
		int i = s.nextInt();
		str2 = str[i];
		str[i] = str1;
		for (i = i + 1; i <= 7; i++) {
			str1 = str[i];
			str[i] = str2;
			str2=str1;

		}
		for (i = 0; i < 8; i++) {
			System.out.print(str[i]);
		}
	}
}
