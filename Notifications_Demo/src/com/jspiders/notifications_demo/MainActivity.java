package com.jspiders.notifications_demo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button notifybutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		notifybutton = (Button) findViewById(R.id.buttonnotify);
		
		notifybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
                 	NotificationCompat.Builder builder	= new NotificationCompat.Builder(MainActivity.this);
                 	builder.setContentTitle("This is my notification");
                 	builder.setContentText("New Notification");
                 	builder.setSmallIcon(R.drawable.ic_launcher);
               
                 	Intent callintent = new Intent(Intent.ACTION_DIAL);
                 	callintent.setData(Uri.parse("tel:"+"555212321"));
                 	
                 	PendingIntent callpendingIntent = PendingIntent.
 			                getActivity(MainActivity.this,1,callintent,0);
                 	
                 	builder.addAction(R.drawable.ic_launcher,"Call",callpendingIntent);
                 	builder.addAction(R.drawable.ic_launcher,"SMS",null);
                 	
                 	Intent pintent = new Intent(MainActivity.this, SecondActivity.class);
                 	PendingIntent pendingIntent = PendingIntent.
                 			                getActivity(MainActivity.this,1,pintent,0);
                 	builder.setContentIntent(pendingIntent);
                 	
                 	Notification notification = builder.build();
                 	
                 	
                NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                manager.notify(1, notification);
          
			}
			
		});
		
		
	}


}
