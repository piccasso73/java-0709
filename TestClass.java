package com.hisham.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "I am your man";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test It");
	}
	
	public static void main(String [] args){
		System.out.println("Inside TestClass main");
		System.out.println(name);
		TestClass test = new TestClass();
		test.testIt();
//		testIt();
		System.out.println(Inf2.name);
		
//		Inf1 obj = new Inf1(); cannot be instantiated
		Inf2 obj = new TestClass(); 
		System.out.println(obj.whoAmI());
		obj.testIt();
	}
}
