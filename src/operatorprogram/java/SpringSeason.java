package operatorprogram.java;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month");
		int month = scan.nextInt();
		System.out.println("Enter Date");
		int date = scan.nextInt();
		if (date <= 20) {
			for (int i = 1; i <= date; i++) {
				if (month >= 3 && month <= 6) {
					System.out.println("True");
					break;
				} else {
					System.out.println("false");
					break;
				}
			}
		} else
		        System.out.println("false:");

	 }

}
