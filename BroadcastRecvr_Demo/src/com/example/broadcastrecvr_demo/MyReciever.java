package com.example.broadcastrecvr_demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) 
	{
		Toast.makeText(context, "Phone State is changed",Toast.LENGTH_SHORT).show();
	}

}
