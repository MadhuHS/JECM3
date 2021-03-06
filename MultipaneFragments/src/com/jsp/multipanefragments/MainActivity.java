package com.jsp.multipanefragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements Communicator {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//this is to identify mobile device
         if  (findViewById(R.id.fragement_container)!=null)	 
         {
        	Version_List listfragment = new Version_List();
        	
        	FragmentTransaction transaction = getFragmentManager().beginTransaction();
            
        	transaction.add(R.id.fragement_container,listfragment);
        	
        	transaction.commit();
         
         }
	}

	@Override
	public void respond(int position) 
	{
		Log.d("DEBUG","position is--->>"+position);
		
		Description_Versions descritionfragment =(Description_Versions) getFragmentManager().findFragmentById(R.id.description_fragment);
		 
		//checking if we have 2 fragments 
		if(descritionfragment!=null)
		 {
			descritionfragment.recievedata(position);
		 }
		
		else
		{
		     //initializing the descfragment with selected position value
			 Description_Versions descfragment = new Description_Versions();
			 Bundle arguments = new Bundle();
			 
			 arguments.putInt("position_selected", position);
			 descfragment.setArguments(arguments);
	         
			 
			 FragmentTransaction transaction = getFragmentManager().beginTransaction();
			 transaction.replace(R.id.fragement_container, descfragment);
			 transaction.addToBackStack(null);
			 transaction.commit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
