package com.wedding.amitwedsjyoti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

	Intent comIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	public void handleClick(View v){
		switch (v.getId()) {
		case R.id.ButtonInvite:
			comIntent = new Intent(HomeActivity.this,InviteActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonWedding:
			comIntent = new Intent(HomeActivity.this,WeddingActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonVenue:
			comIntent = new Intent(HomeActivity.this,VenueActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonCards:
			comIntent = new Intent(HomeActivity.this,CardActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonWelcome:
			comIntent = new Intent(HomeActivity.this,GuestActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonContact:
			comIntent = new Intent(HomeActivity.this,ContactActivity.class);
			startActivity(comIntent);
			break;
		default:
			break;
		}
	}

}
