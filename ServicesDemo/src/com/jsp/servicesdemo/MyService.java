package com.jsp.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	MediaPlayer mp;
	@Override
	public void onCreate() 
	{
		super.onCreate();
		mp = MediaPlayer.create(MyService.this,R.raw.sound_1);	
		Toast.makeText(MyService.this,"Service is created",Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		mp.start();
		Toast.makeText(MyService.this,"Service is STARTED",Toast.LENGTH_SHORT).show();

		return super.onStartCommand(intent, flags, startId);
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mp.stop();
		Toast.makeText(MyService.this,"Service is Destroyed",Toast.LENGTH_SHORT).show();

	}
	
	
	
	@Override
	public IBinder onBind(Intent arg0) 
	{
		return null;
	}

}
