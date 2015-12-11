package com.jsp.servicesdemo;

import android.app.IntentService;
import android.content.Intent;

public class MyIntentservice extends IntentService {

	public MyIntentservice(String name) 
	{
		super("intentservice");
		
	}

	@Override
	protected void onHandleIntent(Intent intent)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
}
