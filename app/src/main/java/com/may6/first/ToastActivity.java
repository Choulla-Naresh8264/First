package com.may6.first;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast);
	}

	public void showToast(View v) {
     	 LayoutInflater inflater = getLayoutInflater();
		 View toastView = inflater.inflate( R.layout.toast_layout , 
				             (ViewGroup) findViewById(R.id.toastView));
		 
		 TextView tv = (TextView)  toastView.findViewById( R.id.toastText);
		 tv.setText( new Date().toString());
		 
		 Toast toast = new Toast(this);
		 toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
		 toast.setDuration( Toast.LENGTH_LONG);
		 toast.setView(toastView);
		 toast.show();
		 
		 
		 
		 
	}
}
