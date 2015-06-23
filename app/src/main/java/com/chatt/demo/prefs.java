package com.chatt.demo;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.annotation.TargetApi;


/**
 * Created by ci on 23-06-15.
 */
public class prefs extends PreferenceActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.prefs);
}


}
