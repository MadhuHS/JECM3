package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{

	Button loginbutton,cancelbutton;
	EditText usernameedittext,passwordedittext;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loginbutton =(Button)findViewById(R.id.buttonlogin);
        usernameedittext = (EditText) findViewById(R.id.editTextusername);
        passwordedittext = (EditText) findViewById(R.id.editTextpassword);
        cancelbutton = (Button) findViewById(R.id.buttoncancel);
        
    }
	
	public void testbutton(View v)
	{
		Log.d("DEBUG", "Login button was clicked");
	}
	
	public void testcancelbutton(View v)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	

    
}
