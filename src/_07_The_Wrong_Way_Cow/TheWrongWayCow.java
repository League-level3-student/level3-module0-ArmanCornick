/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
    	int down = 0;
    	int left = 0;
    	int right = 0;
    	int up = 0;
    	String downCord = "";
    	String upCord = "";
    	String leftCord = "";
    	String rightCord = "";
    	
    	int downArray[] = new int[2];
    	int upArray[] = new int[2];
    	int leftArray[] = new int[2];
    	int rightArray[] = new int[2];
    	
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        for(int i=0;i<field.length;i++) {
        	for(int e=0;e<field[0].length;e++) {
            	if(field[i][e]=='c') {
            		if(i<field.length-2 && field[i+1][e]=='o') {
            			if(field[i+2][e]=='w') {
                			right +=1;
                			rightCord = i + "," + e;
                			rightArray[0] = e;
                			rightArray[1] = i;
                		}
            		}
            		if(i>1 && field[i-1][e]=='o') {
            			if(field[i-2][e]=='w') {
            				left +=1;
            				leftCord = i + "," + e;
            				leftArray[0] = e;
                        	leftArray[1] = i;
                		}
            		}
            		if(e>1 && field[i][e-1]=='o') {
            			if(field[i][e-2]=='w') {
            				up +=1;
            				upCord = i + "," + e;
            				upArray[0] = e;
                        	upArray[1] = i;
                		}
            		}
            		if(e<field[i].length-2 && field[i][e+1]=='o') {
            			if(field[i][e+2]=='w') {
            				down +=1;
            				downCord = i + "," + e;
            				downArray[0] = e;
                        	downArray[1] = i;
                		}
            		}
            	}
            }
        }
        if(left==1) {
        	System.out.println(leftCord);
        	return leftArray;
        } else if(right==1) {
        	System.out.println(rightCord);
        	return rightArray;
        } else if(up==1) {
        	System.out.println(upCord);
        	return upArray;
        } else if(down==1) {
        	System.out.println(downCord);
        	return downArray;
        } else { 
        	return null;
        }
    }
}
