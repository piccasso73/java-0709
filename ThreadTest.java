package com.hisham.sample;

public class ThreadTest extends Thread {

	@Override
	public void run(){
		try {	
			
			long l = (long )(Math.random() * 1000);
			
			System.out.println("I am a new Thread " + this.getName() + " " + this.getPriority() + 
					" running : "+ l);
			Thread.sleep(2000);
			System.out.println("I " + this.getName() + " just go up: " + l);
			
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t1 = new ThreadTest();
		t1.setPriority(MIN_PRIORITY);
		ThreadTest t2 = new ThreadTest();
		t2.setPriority(NORM_PRIORITY);
		ThreadTest t3 = new ThreadTest();
		t3.setPriority(MAX_PRIORITY);
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
