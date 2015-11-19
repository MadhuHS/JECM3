package com.jsp.returnsvalue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

   EditText inputedittext;
   Button startbutton,startactivityforresult;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        inputedittext = (EditText) findViewById(R.id.editTextinput);
        startbutton = (Button) findViewById(R.id.buttonstart);
        startactivityforresult = (Button) findViewById(R.id.buttongetresult);
        
        startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				String input = inputedittext.getText().toString();
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("Key1", input);
				startActivity(intent);
			}
		});
    
        
        startactivityforresult.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String input = inputedittext.getText().toString();
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("Key1", input);
				startActivityForResult(intent,123);
			}
		} );
        
    }
	
	@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			super.onActivityResult(requestCode, resultCode, data);
		}
	
	
	
	
	
	
	
	
    
}
