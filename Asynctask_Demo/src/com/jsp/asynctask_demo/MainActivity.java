package com.jsp.asynctask_demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button downloadbutton;
	TextView mesaagetextview;
	Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		downloadbutton = (Button) findViewById(R.id.buttondownload);
		mesaagetextview = (TextView) findViewById(R.id.textView1);
		
		downloadbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				context=MainActivity.this;
				Network_Demo obj1 = new Network_Demo(mesaagetextview,downloadbutton,context);
				obj1.execute();
				
				
			}
		});
		
	}

}
