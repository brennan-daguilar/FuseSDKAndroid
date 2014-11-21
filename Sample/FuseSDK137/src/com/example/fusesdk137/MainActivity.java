package com.example.fusesdk137;


import com.fusepowered.fuseapi.FuseAPI;
import com.fusepowered.util.FuseLoginError;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Context appContext = getApplicationContext();


		final MessageCallback startSessionCallback = new MessageCallback(this){
			@Override 
			public void sessionLoginError(FuseLoginError arg0) 
			{ 
				// an error has occurred 
			} 

			@Override 
			public void sessionStartReceived() 
			{ 				  
				FuseAPI.displayAd("",new AdCallback(MainActivity.this));
			} 
		};

		FuseAPI.startSession("<YOUR API KEY HERE>", this, appContext, startSessionCallback);
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		FuseAPI.suspendSession();
	}

	@Override
	protected void onResume(){
		super.onResume();
		FuseAPI.resumeSession(this, new MessageCallback(this));
	}

	@Override
	protected void onDestroy() { 
		super.onDestroy();
		FuseAPI.endSession();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
