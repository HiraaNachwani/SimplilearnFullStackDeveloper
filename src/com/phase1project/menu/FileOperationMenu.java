package com.phase1project.menu;

import java.io.IOException;

public class FileOperationMenu {
	
	public static void showMenu() throws IOException
	{
		System.out.println("--------------------------------------");
		System.out.println("\nMenu Available \n\n"
				+ "Enter 1 - Search File \n"
				+ "Enter 2 - Add File \n"
				+ "Enter 3 - Delete File \n-----------------------");

		int option= UserInput.enterOption();
		selectMenu(option);
		System.out.println("--------------------------------------");

	}
	
	private static void selectMenu(int option) throws IOException
	{
		String name = UserInput.enterFileName();
		switch (option){
		case 1 :			
			FileOperations.searchFile(name);
			break;
		case 2 :			
			FileOperations.addFile(name);
			break;
		case 3 :				
			FileOperations.deleteFile(name);
			break;
		default:
			System.out.println("----- Enter the correct option -----");
		}
		
		MainOptionsMenu.showOptions();
	}

}
