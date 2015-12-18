package com.example.mapsdemo;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startmap;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startmap = (Button) findViewById(R.id.button1);
		
		
	}

	public void startmap(View v) 
	{
		String uri = String.format(Locale.ENGLISH, "geo:%f,%f", -0.13,51.51);
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
		startActivity(intent);
	}

}
