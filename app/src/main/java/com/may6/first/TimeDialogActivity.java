package com.may6.first;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimeDialogActivity extends Activity {

	int hour, minute;
	TextView txtTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time_dialog);
		
		txtTime = (TextView) findViewById( R.id.textTime);
		
		Calendar c = Calendar.getInstance();
		hour = c.get (Calendar.HOUR_OF_DAY);
		minute = c.get (Calendar.MINUTE);

		txtTime.setText(  hour + ":" + minute);
	}
	
	public void showTimeDialog(View v){
		   showDialog(1);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		 return   getTimeDialog();
	}
	
	
	public Dialog  getTimeDialog() {
		
		return  new TimePickerDialog(this,
				new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int h, int m) {
						hour = h;
						minute = m;
						txtTime.setText(  hour + ":" + minute);
						
					}
				}
				, hour, minute, false);
}
	


}
