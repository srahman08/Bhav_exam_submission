package examQuestions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Scanner_Random_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] arrayOfRand = new int[10];//No. of items in an array holding random numbers
		System.out.println(arrayOfRand.length);
		int i, j, userNthNum;
		//Before Sort
		for (i = 0; i < arrayOfRand.length; i++) {
		arrayOfRand[i] = rand.nextInt(500);
		 System.out.println("Before sort: "+ i+ " " +arrayOfRand[i]);
		}
		//Sort
		Arrays.sort(arrayOfRand);
		//After sort
		System.out.println("After sorting the array is:");
		//for (i = 0; i < arrayOfRand.length; i++) {
			for (j = 0; j < arrayOfRand.length; j++) {
			System.out.println((j + 1) + " " + arrayOfRand[j]); 
		}
			System.out.println(
					"Give me the  number between 1 to 10, and I'll tell you what random number is located in that location.");
		 userNthNum = sc.nextInt();//User provides Nth place
		System.out.println(arrayOfRand[userNthNum - 1]);

	}

}
/*
 * try { numbers[i] = Integer.parseInt((String) numreader.nextLine()); } catch
 * (NumberFormatException numFormatE) {
 * System.out.println(numFormatE.getMessage() +
 * "cannot be converted to integer"); i = i - 1; // Restart current iteration. }
 * } numreader.close();
 * 
 * // Loop through the number to get sum of the number. int sum = 0; for (int i
 * = 0; i < numbers.length; i++) { sum += numbers[i]; } System.out.println(sum);
 * }
 * 
 */
