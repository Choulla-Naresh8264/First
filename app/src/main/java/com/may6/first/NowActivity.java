package com.may6.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class NowActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now);
        tv = (TextView) findViewById( R.id.tvMessage);

    }

    public void showTime(View v) {
        Log.d("First", "You clicked on button!");

        Date d = new Date();
        tv.setText(d.toString());

    }

    public void clearText(View v) {
        tv.setText("");
    }
}
