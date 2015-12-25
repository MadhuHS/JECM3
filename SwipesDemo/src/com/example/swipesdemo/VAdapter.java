package com.example.swipesdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class VAdapter extends FragmentPagerAdapter
{

	public VAdapter(FragmentManager fragmentManager) 
	{
		super(fragmentManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position)
	{
		switch (position) {
		case 0 : new javafrag();
		case 1 : new j2ee_frag();
		case 2 : new androidfrag();

		default:
			break;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
