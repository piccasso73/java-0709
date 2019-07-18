package com.hisham.sample;

public class SampleA {
	
	String myName = "";
	
	public SampleA() {
		// TODO Auto-generated constructor stub
	}
	public SampleA(String myName) {
		// TODO Auto-generated constructor stub
		this.myName = myName;
	}
	
	@Override
	public String toString() {
		
		return "SampleA";
	}
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if(obj instanceof SampleA) {
			String objName = ((SampleA) obj).toString();
			if(objName.equals(myName)){
				isEqual = true;
			}
		}
		return isEqual;
	}
}
