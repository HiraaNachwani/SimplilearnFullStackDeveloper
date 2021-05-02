package com.phase1project.menu;

import java.io.IOException;

public class MainOptionsMenu {	

	static String path =System.getProperty("user.dir")+"\\Files";

	public static void showOptions() throws IOException
	{
		System.out.println("--------------------------------------");
		System.out.println("\nOption available \n\n"
				+ "Enter 1 - Show all available files\n"
				+ "Enter 2 - Open menu for search, add or delete the files \n"
				+ "Enter 3 - Exit Application\n-----------------------");

		int option= UserInput.enterOption();
		selectOption(option);
		System.out.println("--------------------------------------");

	}

	private static void selectOption(int option) throws IOException
	{

		switch (option){
		case 1 :			
			MainOperations.showAllFiles();
			break;
		case 2 :			
			FileOperationMenu.showMenu();
			break;
		case 3 :			
			MainOperations.exitApplication();
			break;
		default:
			System.out.println("----- Enter the correct option -----");
		}

		showOptions();
	}

	

	

	

	

	


	

}
