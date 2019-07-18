package com.hisham.sample;

public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInner obj = new AnonymousInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("Inside myMethod");
			}
		};
		
		obj.myMethod();
	}

}
