package com.phase1project.menu;

import java.util.Scanner;

public class UserInput {
	
	public static int enterOption()
	{

		System.out.println("Enter Valid Id from above");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		return option;
	}

	public static String enterFileName()
	{

		System.out.println("Enter File Name");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		return name;
	}

}
