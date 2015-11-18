package com.jsp.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button startbutton;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        startbutton = (Button) findViewById(R.id.buttonstartsecond);
        
        startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
 				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
 				startActivity(intent);
			}
		});
    }

    
}
