package com.test.loop;

public class TestForLoop {

	public static void main(String[] args) {
		
		String names[] = {"Siva","Raju","Eswar","Gopi","Rajesh","Test","User","Xyz","Abc"};

		//print the names with advanced loop.
		for(String name : names){
			System.out.println("Name :: "+name);
			System.out.println("Name2 :: "+name);
		}
		System.out.println("Name :: "+names);
		System.out.println("Name ********** :: "+names);

	}

}
