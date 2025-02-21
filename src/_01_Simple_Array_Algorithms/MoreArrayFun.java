package _01_Simple_Array_Algorithms;

import java.util.Random;


public class MoreArrayFun {

	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

	}

	static void printMethod(String strings[]) {
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
		}
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.


	static void printMethodBackwards(String strings[]) {
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[strings.length-i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.


	static void printMethodFlipFlop(String strings[]) {
		Boolean e = true;

		for(int i=0;i<strings.length;i++) {
			if(e==true) {
				System.out.println(strings[i]);
				e = false;
			} else {
				e = true;
			}
			
		}
		
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.


	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.


}
