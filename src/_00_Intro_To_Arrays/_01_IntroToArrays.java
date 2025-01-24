package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] strings = { "a", "b", "c", "d", "e"};
        // 2. print the third element in the array
    	System.out.println(strings[2]);
        // 3. set the third element to a different value
    	strings[2] = "haha";
        // 4. print the third element again
    	System.out.println(strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i=0;i<strings.length;i++) {
    		strings[i] = "hehe";
    		System.out.println(strings[i]);
    	}
    	
        // 7. make an array of 50 integers
    	Integer[] large = new Integer[50];
    	Random q = new Random();
    	int e = 101;
    	int l = 0;
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	for(int i=0;i<large.length;i++) {
    		large[i] = q.nextInt(100);
    		if(large[i]<e) {
    			e = large[i];
    		}
    		if(large[i]>l) {
    			l = large[i];
    		}
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	System.out.println(e);
    	System.out.println(l);
        // 10 print the entire array to see if step 8 was correct
    	System.out.println(large);
        // 11. print the largest number in the array.

        // 12. print only the last element in the array
    	System.out.println(large[49]);
    }
}
