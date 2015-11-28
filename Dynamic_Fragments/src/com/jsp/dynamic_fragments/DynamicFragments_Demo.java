package com.jsp.dynamic_fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DynamicFragments_Demo extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container,
			Bundle savedInstanceState) 
	{
		return inflater.inflate(R.layout.dynamic_fragment_layout,container,false);
	}
}
