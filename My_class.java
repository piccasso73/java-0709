package com.hisham.sample;

public class My_class {
	
	public void displayMessage(Message m) {
		System.out.println(m.greet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantianting the outer class
		Outer_Class outer = new Outer_Class();
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		//Accessing the display_inner() method.
		outer.display_Inner();
		
		// Pass anoymous inner class as a parameter
		My_class obj = new My_class();
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});
	}

}
