package com.apptentive.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.apptentive.mylibrary.Library;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@SuppressWarnings("unused")
	public void showViewOne(View view) {
		Library.showViewOne(this);
	}

	@SuppressWarnings("unused")
	public void showViewTwo(View view) {
		Library.showViewTwo(this);
	}
}
