package com.may6.first;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("First", "onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("First", "onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("First", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("First", "onStop()");
    }

    public void callSecond(View v) {
        Intent  intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message","Hello!");
        startActivity(intent);
    }
}
