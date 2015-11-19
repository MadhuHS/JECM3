package com.jsp.returnsvalue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	TextView outputtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		outputtextview = (TextView) findViewById(R.id.textViewoutput);
		
		Bundle extras;
		
		 Intent intent = getIntent();
		 extras = intent.getExtras();
		outputtextview.setText(extras.getString("Key1"));
		
		String result =  "Hello " + extras.getString("Key1");
		Intent intent1 = new Intent();
		intent1.putExtra("Result", result);
		setResult(123 , intent1);
		
	}

}
