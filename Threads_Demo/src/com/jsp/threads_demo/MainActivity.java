package com.jsp.threads_demo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button startbutton,displaybutton;
	TextView displaytextview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton = (Button) findViewById(R.id.buttonstart);
		displaybutton = (Button) findViewById(R.id.buttondisplay);
		displaytextview = (TextView) findViewById(R.id.textView1);
		
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				longrunningtask();
			}
		});
		
		
		displaybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Toast.makeText(MainActivity.this,"Display button",Toast.LENGTH_SHORT).show();
				
			}
		});
		
	}

	public void longrunningtask()
	{
		
		new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				//Toast.makeText(MainActivity.this, "Starting long running task",Toast.LENGTH_SHORT).show();
				Log.d("[DEBUG]","Starting long running task");
				for (int i = 0; i <= 10; i++)
				{
					try 
					{
						Thread.sleep(200);
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}

				}
				
				displaytextview.setText("100%");
				
			}
		}).start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
