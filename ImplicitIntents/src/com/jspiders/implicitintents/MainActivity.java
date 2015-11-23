package com.jspiders.implicitintents;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button callbutton,browsebutton,camerabutton;
	ImageView displayimageview;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        callbutton  = (Button) findViewById(R.id.buttoncall);
        browsebutton = (Button) findViewById(R.id.buttonbrowser);
        camerabutton = (Button) findViewById(R.id.buttoncamera);
        displayimageview = (ImageView) findViewById(R.id.imageViewdisplay);
        
        
        
        callbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent callintent = new Intent(Intent.ACTION_CALL);
				callintent.setData(Uri.parse("tel:"+"97844114252"));
				startActivity(callintent);
				
			}
		});
    
	
        browsebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
 				Intent browserintent = new Intent(Intent.ACTION_VIEW);
 				browserintent.setData(Uri.parse("http://www.google.com"));
 				startActivity(browserintent);
			}
		});
	
	
        camerabutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(cameraintent,111);
				
			}
		});
	}

	
	@Override
	protected void onActivityResult(int requestCode, 
			int resultCode, Intent data) 
	{
		if(resultCode==RESULT_OK)
		{
			Bitmap bitmap =  (Bitmap)data.getExtras().get("data");
			displayimageview.setImageBitmap(bitmap);
			
		}
		
		else if(resultCode==RESULT_CANCELED)
		{
			Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_SHORT).show();
		}
	}
    
}
