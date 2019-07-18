package com.hisham.sample;

public class FinalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final.sayHi("Hisham");
		Final obj = new Final();
		obj.sayBye("Java");
		System.out.println(obj.className);
		System.out.println(obj.className2);

		obj.className = "MyClass";
		obj.className2 = "MyClass2";

		System.out.println(obj.className);
		System.out.println(obj.className2);
	}

}
