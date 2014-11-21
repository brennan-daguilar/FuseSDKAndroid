package com.example.fusesdk137;

import android.app.Activity;

import com.fusepowered.util.FuseAdCallback;

public class AdCallback extends FuseAdCallback{

	private Activity activity;

	public AdCallback(Activity activity) {
		this.activity = activity;
	}
	
	@Override
	public void callback() {
		CallbackUtil.logCallback("AdCallback", activity, "callback");
	}
	
	@Override
	public void adClicked() {
		CallbackUtil.logCallback("AdCallback", activity, "adClicked");
	}

	@Override
	public void adDisplayed() {
		CallbackUtil.logCallback("AdCallback", activity, "adDisplayed");
	}

	@Override
	public void adWillClose() {
		CallbackUtil.logCallback("AdCallback", activity, "adWillClose");
	}
	
	@Override
	public void adAvailabilityResponse(int available, int error) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void adFailedToLoad() {
		CallbackUtil.logCallback("AdCallback", activity, "adFailedToLoad");
	}
	
	@Override
	public void adWillLeaveApp() {
		CallbackUtil.logCallback("AdCallback", activity, "adWillLeaveApp");
	}

	@Override
	public void rewardedVideoCompleted(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void videoCompleted(String arg0) {
		// TODO Auto-generated method stub
		
	}	
}
