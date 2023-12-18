package com.anytime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Read input
	        int n = scanner.nextInt();
	        ArrayList<Integer> nums = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            nums.add(scanner.nextInt());
	        }

	        int q = scanner.nextInt();
	        for (int i = 0; i < q; i++) {
	            String operationType = scanner.next();
	            if ("Insert".equals(operationType)) {
	                int index = scanner.nextInt();
	                int value = scanner.nextInt();
	                nums.add(index, value);
	            } else if ("Delete".equals(operationType)) {
	                int valueToDelete = scanner.nextInt();
	                nums.remove(valueToDelete);
	            }
	        }

	        // Print the result
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }

	}

}
