package com.may6.first;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class OrientationDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_orientation);
        Log.d("First", "onCreate()");
    }

    public void sayHello(View v) {
        Toast.makeText(this,"Hello!", Toast.LENGTH_LONG).show();
    }
}
