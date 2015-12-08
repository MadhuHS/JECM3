package com.jspiders.parsepushnotifications;

import com.parse.Parse;
import com.parse.ParseInstallation;

import android.app.Application;

public class ParseApp extends Application {
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		  Parse.initialize(getApplicationContext(),"cfX9AG13glQd2stmPW0WYbm4LNTrfNQGu4nZFven","JXQyDd5dVXWd4LrEWuqe00cDr23G5aHxYSPP8PFN");
		  ParseInstallation.getCurrentInstallation().saveInBackground();

	}

}
