package com.jsp.multipanefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Description_Versions extends Fragment {
	
	TextView displayversion;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.description_fragment,container,false);
	}
	
	
	@Override
	public void onStart() 
	{
		super.onStart();
		
		Bundle args =  getArguments();
		
		if(args!=null)
		{
			recievedata(args.getInt("position_selected"));
		}
	}
	
	
	public void recievedata(int position)
	{
	 
		String[] versiondesc = {"This is version 1","This is version 2","This is version 3","This is version 4"};
		displayversion= (TextView) getActivity().findViewById(R.id.textView1);
		displayversion.setText(versiondesc[position]);
	}

}
