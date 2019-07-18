package com.hisham.sample;

public class TernaryOperator {
	public static void main(String[] args) {
		//if input number > 10, set the number as 10.
		String strInput = "";
		
//		System.out.println(strInput instanceof String);
		try {
			strInput = args[0];
			int input = Integer.parseInt(strInput);
			int number = (input > 10) ? 10 : input;
			
			
			System.out.println("number = " + number);
			
			//Arithmetic
			int num = 10;
			
			int result = num/input;
			System.out.println("Result : " + result);
		
		} catch (NumberFormatException err) {
			System.out.println("I guess you didn't give me a number :" + strInput);
			System.out.println();
			//err.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("OOppppss math error!!!");
		} catch (Exception ex) {
			System.out.println("I don't know something's wrong");
//			ex.printStackTrace();
		} finally {
			System.out.println("Finally it's done");
		}
		
		
	}
}