package com.hisham.sample;

public class TestSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleA obj1 = new SampleA();
		SampleB obj2 = new SampleB();
		
		System.out.println("About to print objects..");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName = new String (obj1.toString());
		System.out.println("strObjName : " + strObjName);
		
		SampleA obj3 = new SampleA("Java");
		System.out.println(obj3.toString());
		if(obj1.equals(obj3)){
			System.out.println("both has same name");
		}else {
			System.out.println("both are different");
		}

	}

}
