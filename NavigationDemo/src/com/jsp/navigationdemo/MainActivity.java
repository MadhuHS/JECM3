package com.jsp.navigationdemo;

import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.R.anim;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	DrawerLayout drawerLayout;
	ListView optionslistview;
	ActionBarDrawerToggle drawerToggle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
		optionslistview = (ListView) findViewById(R.id.listview);
		
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(false);

		drawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,R.drawable.ic_action_back, 0, 0);
		drawerLayout.setDrawerListener(drawerToggle);
		
		String[] options = {"Login","Share","Settings","Help"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, options);
		optionslistview.setAdapter(adapter);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState)
	{
		super.onPostCreate(savedInstanceState);
		drawerToggle.syncState();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		if(drawerToggle.onOptionsItemSelected(item))
		{
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}

}
