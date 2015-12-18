package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends Activity 
{

	Button loginbutton,cancelbutton,clearbutton;
	EditText usernameedittext,passwordedittext;
	CheckBox rememberpasswordcb;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loginbutton =(Button)findViewById(R.id.buttonlogin);
        usernameedittext = (EditText) findViewById(R.id.editTextusername);
        passwordedittext = (EditText) findViewById(R.id.editTextpassword);
        cancelbutton = (Button) findViewById(R.id.buttoncancel);
        rememberpasswordcb = (CheckBox) findViewById(R.id.checkBoxremeberpassword);
        clearbutton = (Button) findViewById(R.id.button1);
    }
	
	@Override
	protected void onStart() 
	{
		super.onStart();
		
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
		usernameedittext.setText(sp.getString("usId","na"));
		passwordedittext.setText(sp.getString("pwd", "na"));
	}
	
	public void testbutton(View v)
	{
		if(rememberpasswordcb.isChecked())
		{
			String entusername = usernameedittext.getText().toString();
			String entpassword = passwordedittext.getText().toString();
			
			SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
		    SharedPreferences.Editor editor = sp.edit();
		    editor.putString("usId", entusername);
		    editor.putString("pwd",entpassword);
		    editor.commit();
			
			/*SharedPreferences sp = getSharedPreferences("settings",Context.MODE_APPEND);
			SharedPreferences.Editor editor = sp.edit();
		    editor.putString("usId", entusername);
		    editor.putString("pwd",entpassword);
		    editor.commit();*/
		}
		}
		
	
	
	public void cleardata(View v)
	{
		SharedPreferences sp =  PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
	    sp.edit().clear().commit();
	    usernameedittext.setText("");
	    passwordedittext.setText("");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			
		}
		
		return super.onKeyDown(keyCode, event);
	}
	
	
	
	
	
	
	
	
	
	

    
}
