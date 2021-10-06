package com.git.demo;

public class JustDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = ()->{
			System.out.println("This is run method");
		};
		
		Thread thread = new Thread(r);
		thread.start();

	}

}
