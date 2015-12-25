package com.example.swipesdemo;

import android.app.ActionBar.TabListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;


public class MainActivity extends FragmentActivity implements ActionBar.TabListener, TabListener {

	android.app.ActionBar actionBar;
	ViewPager viewPager;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        actionBar = getActionBar();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        
        VAdapter adapter = new VAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Java").setTabListener(MainActivity.this));
        actionBar.addTab(actionBar.newTab().setText("J2ee").setTabListener(MainActivity.this));
        actionBar.addTab(actionBar.newTab().setText("Android").setTabListener(MainActivity.this));

        
    }


	@Override
	public void onTabReselected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabUnselected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

}
