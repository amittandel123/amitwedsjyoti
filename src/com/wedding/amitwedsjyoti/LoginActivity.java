package com.wedding.amitwedsjyoti;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	MediaPlayer myMusic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		myMusic = MediaPlayer.create(LoginActivity.this, R.raw.music);
		myMusic.start();
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		myMusic.release();
		finish();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	public void handleClick(View v){

		switch (v.getId()) {
		case R.id.buttonLogin:
			EditText passwordText = (EditText)findViewById(R.id.editTextPassword);
			String passwordString = passwordText.getText().toString();
			//		Log.i(TAG, passwordString);
			if(passwordString.equals("27022015"))
			{
				//		Log.i(TAG, "Correct");
				Intent actIntent = new Intent(LoginActivity.this,HomeActivity.class);
				startActivity(actIntent);
			}
			else
			{
				Toast.makeText(LoginActivity.this, "Wrong Password", Toast.LENGTH_LONG).show();
			}			
			break;
		}
	}
}
