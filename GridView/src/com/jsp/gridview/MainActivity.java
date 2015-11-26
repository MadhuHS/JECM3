package com.jsp.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    GridView phonesgriGridView;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] phones = {"SONY","HTC","MI","MOTO","MICROMAX","SAMSUNG","APPLE","OPPO","INTEX","NOKIA","PANASONIC","LAVA"};

        phonesgriGridView = (GridView) findViewById(R.id.gridViewphones);
    
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phones);
        phonesgriGridView.setAdapter(adapter);
        
        phonesgriGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, 
					View arg1, int position,
					long arg3) {
				
				Toast.makeText(MainActivity.this,phones[position],Toast.LENGTH_SHORT).show();
			}
		});
	
	}

    
}
