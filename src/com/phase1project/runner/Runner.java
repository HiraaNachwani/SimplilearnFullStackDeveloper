package com.phase1project.runner;

import java.io.IOException;

import com.phase1project.menu.MainOptionsMenu;

public class Runner {

	private static void projectDetails()
	{

		System.out.println("----- Welcome to LockedMe.com ----- \n\nDeveloped By : Hiraa Nachwani "
				+ "\nEmail : hiraa.nachwani@gmail.com \n\nFeel free to connect if any query, thanks ! ");

	}

	public static void main(String[] args) throws IOException {
		projectDetails();
		MainOptionsMenu.showOptions();
	}

}
