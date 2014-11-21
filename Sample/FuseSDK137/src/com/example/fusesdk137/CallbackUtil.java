package com.example.fusesdk137;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class CallbackUtil {

	public static void logCallback(String tag, Activity activity, final String msg) {
		Log.i(tag, msg);

		final Context context = activity.getApplicationContext();
		final int duration = Toast.LENGTH_SHORT;
		activity.runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				Toast toast = Toast.makeText(context, msg, duration);
				toast.show();
			}
		});
	}

}