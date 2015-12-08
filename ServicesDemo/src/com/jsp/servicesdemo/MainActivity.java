package com.jsp.servicesdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startservicebutton,stopservicebutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startservicebutton = (Button) findViewById(R.id.buttonstartservice);
		stopservicebutton = (Button) findViewById(R.id.buttonstopservice);
	
		startservicebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent startintent = new Intent(MainActivity.this,MyService.class);
				startService(startintent);
				
			}
		});
	
		
		stopservicebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent stopintent = new Intent(MainActivity.this,MyService.class);
				stopService(stopintent);
			}
		});
		
	
	
	
	}


}
