package com.jsp.externalstorage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button readbutton,savebutton;
	EditText inputedittext;
	TextView displaytextview;
	private FileOutputStream fos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		readbutton = (Button) findViewById(R.id.buttonread);
		savebutton = (Button) findViewById(R.id.buttonsave);
		inputedittext = (EditText) findViewById(R.id.editTextinput);
		displaytextview = (TextView) findViewById(R.id.textViewoutput);	
	}

	
	public void savedata(View v)
	{
		String state = Environment.getExternalStorageState();
		
		if(state.equalsIgnoreCase(Environment.MEDIA_MOUNTED))
		{
			File root = Environment.getExternalStorageDirectory();
			
			File myfile  = new File(root,"ExternalStorage.txt");
			
			try 
			{
				String inputdata =  inputedittext.getText().toString();
				fos = new FileOutputStream(myfile);
				fos.write(inputdata.getBytes());
			} 
			
			catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		else
		{
			Toast.makeText(MainActivity.this,"No SD card",Toast.LENGTH_LONG).show();
		}
	}
	
	
	public void readdata(View v)
	{
String state = Environment.getExternalStorageState();
		
		if(state.equalsIgnoreCase(state))
		{
			File root = Environment.getExternalStorageDirectory();
			
			File myfile  = new File(root,"ExternalStorage.txt");
			
			try 
			{
				FileInputStream fis = new FileInputStream(myfile);
				InputStreamReader ins = new InputStreamReader(fis);
				BufferedReader reader = new BufferedReader(ins);
				
				StringBuffer buffer= new StringBuffer();
				String line = "";
				
				while ((line=reader.readLine())!=null)
						
				{
					buffer.append(line+"\r"+"\n");
						
				}
			
				displaytextview.setText(buffer.toString());
			} 
			
			
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			Toast.makeText(MainActivity.this,"No SD card",Toast.LENGTH_LONG).show();

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
