package com.phase1project.menu;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	
	public static void addFile(String name) throws IOException {
		File file = new File(MainOptionsMenu.path+"\\"+name);
		if(file.createNewFile())
		{
			System.out.println(name + " File Added successfully ");
		}
		else {
			System.out.println("Failed to add the file or file is already Exist");
		}
	}

	public static void deleteFile(String name) throws IOException {
		File file = new File(MainOptionsMenu.path+"\\"+name);
		if(file.delete())
		{
			System.out.println(name + " File Deleted successfully ");
		}
		else {
			System.out.println("Failed to delete the file or file doesn't exist");
		}
	}


	public static void searchFile(String name) throws IOException {


		File folder = new File(MainOptionsMenu.path);
		File[] listOfFiles = folder.listFiles();
		int flag =0;
		if(listOfFiles == null)
		{
			System.out.println("Empty Directory or No Files in Directory");
		}
		else
		{			
			for (File file : listOfFiles)
			{
				if(file.getName().equals(name)) 
				{
					flag = 1;
				}
			}
		}
		
		if(flag==0) {
			
			System.out.println("File not found in the directory");
			
		}
		else if(flag ==1)
		{
			System.out.println("File found and available in the directory");
		}

	}


}
