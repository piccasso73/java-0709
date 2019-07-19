package com.hisham.sample;
import static com.hisham.sample.Day.*;
public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {this.day = day;}
	
	public void tellItLIkeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
	
	public static void main(String [] args) {
		EnumTest test = new EnumTest(FRIDAY);
		test.tellItLIkeItIs();
		EnumTest test2 = new EnumTest(MONDAY);
		test.tellItLIkeItIs();
		EnumTest test3 = new EnumTest(SATURDAY);
		test.tellItLIkeItIs();
		EnumTest test4 = new EnumTest(SUNDAY);
		test.tellItLIkeItIs();
		EnumTest test5 = new EnumTest(TUESDAY);
		test.tellItLIkeItIs();
	}
	
}
