package com.phase1project.menu;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class MainOperations {

	public static void showAllFiles()
	{


		File folder = new File(MainOptionsMenu.path);
		File[] listOfFiles = folder.listFiles();

		ArrayList<String> array = new ArrayList<String>();
		for(File file : listOfFiles) {
			array.add(file.getName());
		}
		Collections.sort(array);

		if(array.isEmpty())
		{
			System.out.println("Empty Directory or no files available in the directory");
		}
		else
		{
			System.out.println("----- All Files -----");
			for(String str : array)
			{
				System.out.println(str);
			}
		}
	}



	public static void exitApplication()
	{

		System.out.println("----- Exited Successfully ------");
		System.exit(0);

	}
}
