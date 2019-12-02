package com.qa.seatingchart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	private static final int NumSeat = 6;

	public static void main(String[] args) {

		// Create an array
		String[] seatingPlan = new String[] { "Ewan Donovan", "Euan Rossie", "Anthony Wilkinson", "Neeven Valydon",
				"Tiggs Knowels", "James Kiesslinger", "Harris Hanley", "Jon Georgiou", "Liam Mclvor", "Matt Farrow",
				"Becky Radcliffe", "Chloe Addock", "Jess Layton", "Alwin Thomas", "Luke Pugh", "Luke Cottenham",
				"James Barron", "Alex Russo", "Zohaib Zahid", "Luke Harrison", "Lizzie Colwell", "Chris Jacobs", "Adam Martin" };
		int[] Array = new int[]{1,2,3,4,5,6};

		// Shuffle the elements in the array
		List<String> sp = Arrays.asList(seatingPlan);
		Collections.shuffle(sp);

		// create a loop that prints the names of their row position
		for (int i = 1; i < seatingPlan.length; i++) {
			String Name = sp.get(i);
			String Name2 = sp.get(i - 1);
			String[] check1 = Name.split(" ");
			String[] check2 = Name2.split(" ");
			
			if (check1[0].equals(check2[0])) {
				System.out.println("");
				System.out.println("Two people sat together!");
			}
			if (i < NumSeat+1 ) {
			System.out.print(Array[i-1]);
			}
			if (i>=NumSeat+1 && i <(NumSeat*2)+1) {
				System.out.print(Array[i-(NumSeat+1)]);
			}
			if (i>=(NumSeat*2)+1 && i <(NumSeat*3)+1) {
				System.out.print(Array[i-((NumSeat*2)+1)]);
			}
			if (i>=(NumSeat*3)+1 && i <(NumSeat*4)+1) {
				System.out.print(Array[i-((NumSeat*3)+1)]);
			}
			
			System.out.print(" "+Name);
			System.out.print(",		   ");
			if (i == NumSeat || i == NumSeat * 2 || i == NumSeat * 3 || i == NumSeat * 4) {
				System.out.print("    Window");
				System.out.println(" ");
			}
		}
	}
}
