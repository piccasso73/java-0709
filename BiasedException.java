package com.hisham.sample;


public class BiasedException extends Exception {
	String str1;
	
	public BiasedException(String str2) {
		// TODO Auto-generated constructor stub
		
	}
	public String toString(){
		return ("BiasedException Occurs : " + str1);
	}
}
//public class HishamException {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try{
//			System.out.println("Starting of try block");
//			throw new BiasedException("This is my error message");
//		} catch (BiasedException ex) {
//			System.out.println("Catch Block");
//			System.out.println(ex);
//		}
//	}
//
//}
