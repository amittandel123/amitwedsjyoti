package com.wedding.amitwedsjyoti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class GuestActivity extends ActionBarActivity {
	Intent comIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guest);
	}

	public void handleClick(View v){
		switch (v.getId()) {
		case R.id.buttonAmit:
			comIntent = new Intent(GuestActivity.this,AmitHaladActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonJyoti:
			comIntent = new Intent(GuestActivity.this,JyotiHaladActivity.class);
			startActivity(comIntent);
			break;
		}
	}


}
