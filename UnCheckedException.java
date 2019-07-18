package com.hisham.sample;

class UnCheckedException {  
   public static void main(String args[])
   {
	   try {
		   int num1=10;
		   int num2=0;
		   /*Since I'm dividing an integer with 0
		    * it should throw ArithmeticException
		    */
		   int res=num1/num2;
		   System.out.println(res);
	   } catch (ArithmeticException ex){
		   System.out.println("Math error operation");
	   } catch (Exception e) {
		   System.out.println("Oppps something wrong....");
	   }
	
   }
}