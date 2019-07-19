package com.hisham.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ** Non Generic **
		List list = new ArrayList();
		
		list.add(new Final());
		String s = (String) list.get(0);
		System.out.println("I got " + s);
		*/
		
		/** Generic **/
		List <String> list = new ArrayList<String>();
		list.add(new String("Hello"));
		list.add(new String("Hai"));
		list.add(new String("Mother"));
		/*
		for(String str: list ){
			System.out.println("I got " + str);
		} */
		/*
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() +" ");
			
		}*/
		
		// Using Iterator for filtering collection.
		for(Iterator<?> it = list.iterator(); it.hasNext();){

			String s = (String) it.next();
			if(s.equals("Hello")) 
				System.out.println("I got :" + s);
		}
//		list.add(Final()); don't valid couse type checking is set to String object.
		
//		String s = list.get(0);
//		System.out.println("I got " + s);
		
	}

}
