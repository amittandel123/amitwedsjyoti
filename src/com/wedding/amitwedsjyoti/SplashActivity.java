package com.wedding.amitwedsjyoti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class SplashActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread timer = new Thread(){
			public void run(){
				// TODO Auto-generated method stub
				super.run();
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent startIntent = new Intent("android.start.LOGIN");
					startActivity(startIntent);
				}
			}
		};
		timer.start();
	}
}
