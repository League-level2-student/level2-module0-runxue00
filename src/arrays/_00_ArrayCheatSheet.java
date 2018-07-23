package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruits = {"litchi", "yan me", "kiwi", "dragonfruit", "mango"};
		//2. print the third element in the array
		JOptionPane.showMessageDialog(null, fruits[2]);
		//3. set the third element to a different value
		fruits[2] = "grape";
		//4. print the third element again
		JOptionPane.showMessageDialog(null, fruits[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<fruits.length; i++) {
			JOptionPane.showMessageDialog(null, fruits[i]);
		}
		
		//6. make an array of 50 integers
		int[] ages = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < ages.length; i++) {
			ages[i]=r.nextInt(51);
			
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int lowest = Integer.MAX_VALUE;
		for (int i = 0; i < ages.length; i++) {
			if(lowest > ages[i]) {
				lowest=ages[i];
		} 
		}
		JOptionPane.showMessageDialog(null, lowest);
		
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]); 
		}
		
		//10. print the largest number in the array.
		int highest = Integer.MIN_VALUE;
		for (int i = 0; i < ages.length; i++) {
			if(highest<ages[i]) {
				highest=ages[i];
		}
		}
		JOptionPane.showMessageDialog(null, highest);
	}
}
