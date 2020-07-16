package com.wedding.amitwedsjyoti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class CardActivity extends ActionBarActivity {
	Intent comIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_card);
	}

	public void handleClick(View v){
		switch (v.getId()) {
		case R.id.buttonAmit:
			comIntent = new Intent(CardActivity.this,AmitPatrikaActivity.class);
			startActivity(comIntent);
			break;
		case R.id.ButtonJyoti:
			comIntent = new Intent(CardActivity.this,JyotiPatrikaActivity.class);
			startActivity(comIntent);
			break;
		}
	}


}
