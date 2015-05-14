package com.apptentive.mylibrary;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by sky on 5/14/15.
 */
public class Library {

	public static void showViewOne(Activity activity) {
		Intent intent = new Intent();
		intent.setClass(activity, ActivityOne.class);
		activity.startActivity(intent);
	}

	public static void showViewTwo(Activity activity) {
		Intent intent = new Intent();
		intent.setClass(activity, ActivityTwo.class);
		activity.startActivity(intent);
	}
}
