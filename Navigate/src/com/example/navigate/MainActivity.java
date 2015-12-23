package com.example.navigate;

import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	DrawerLayout drawerLayout;
	ListView listView;
	ActionBarDrawerToggle drawerlistner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
		listView = (ListView) findViewById(R.id.list1);
		
		
		drawerlistner = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,R.drawable.ic_action_back,0,0);
		drawerLayout.setDrawerListener(drawerlistner);
		
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		
		
		String[] data = {"Login","Share","Settings","Help"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
		listView.setAdapter(adapter);
		
		
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawerlistner.syncState();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if(drawerlistner.onOptionsItemSelected(item))
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
