package problems;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3and5 {

	public static void main(String[] args) {

		List<Integer> multiplesof3and5 = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiplesof3and5.add(i);
				sum = sum + i;
			}
		}
		System.out.println(multiplesof3and5);
		System.out.println("Sum of the numbers is: " + sum);
	}

}
