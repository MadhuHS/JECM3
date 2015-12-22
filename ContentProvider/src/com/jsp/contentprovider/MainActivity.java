package com.jsp.contentprovider;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {

	ListView contactslistview;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		contactslistview = (ListView) findViewById(R.id.listView1);
		
		ContentResolver cr = getContentResolver();
		
		Cursor phonecursor = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
		
		String[] from = {ContactsContract.Contacts.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};		
		
	    int views[] = {R.id.textViewname,R.id.textViewnumber};
	    
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(MainActivity.this,R.layout.list_row,phonecursor,from,views,1);
		
		contactslistview.setAdapter(adapter);
		
		
	}


}
