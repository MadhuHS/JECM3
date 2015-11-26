package com.jsp.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView phoneslistview;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        phoneslistview = (ListView) findViewById(R.id.listView1);
        
        final String[] phones = {"SONY","HTC","MI","MOTO","MICROMAX","SAMSUNG","APPLE","OPPO","INTEX","NOKIA","PANASONIC","LAVA"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phones);
           
        phoneslistview.setAdapter(adapter);
        
        phoneslistview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, 
					View arg1, int position,
					long arg3) {
				
				Toast.makeText(MainActivity.this,phones[position],Toast.LENGTH_SHORT).show();
				
				
			}
		});
        
    }
    
}
