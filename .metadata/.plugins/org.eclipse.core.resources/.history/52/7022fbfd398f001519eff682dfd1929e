package com.jsp.intents2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

	EditText inputEditText;
	Button sendbButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		sendbButton = (Button) findViewById(R.id.buttonsend);
		inputEditText = (EditText) findViewById(R.id.editTextinput);
		
		sendbButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String input =  inputEditText.getText().toString();
				Intent sendintent = new Intent();
				sendintent.putExtra("Key1",input);
				setResult(RESULT_OK, sendintent);
				finish();
			}
		});
		
		
		
		
		
		
		
		
	}


}
