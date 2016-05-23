package com.may6.first;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class TwitterPreferencesActivity extends PreferenceActivity {
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        this.addPreferencesFromResource( R.xml.twitter_pref);
	    }

}
