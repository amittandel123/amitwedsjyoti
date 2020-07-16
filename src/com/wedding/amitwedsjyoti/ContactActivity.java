package com.wedding.amitwedsjyoti;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class ContactActivity extends ActionBarActivity {
	Intent callIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);
	}

	public void makeCall(View v){
		switch (v.getId()) {
		case R.id.textViewMob1:
			callIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919209221043"));
			startActivity(callIntent);
			break;
		case R.id.TextViewMob2:
			callIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919987518538"));
			startActivity(callIntent);
			break;
		default:
			break;
		}
	}
}
