package com.may6.first;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class DateDialogActivity extends Activity {

	int year,month,day;
	
	EditText editDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date_dialog);
		
		editDate = (EditText) findViewById( R.id.editDate);
		
		Calendar c = Calendar.getInstance();
		year = c.get (Calendar.YEAR);
		month = c.get (Calendar.MONTH);
		day = c.get (Calendar.DAY_OF_MONTH);
		
		editDate.setText(  year + "/" + month + "/" + day);
	}
	
	public void showDateDialog(View v){ 
		   showDialog(1);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		 return   getDateDialog();
	}
	
	
	public Dialog  getDateDialog() {
		
		return  new DatePickerDialog(this,
				new DatePickerDialog.OnDateSetListener() {
					@Override
					public void onDateSet(DatePicker arg0, int y, int m, int d) {
						year= y;
						month = m;
						day = d;
						editDate.setText(  year + "/" + month + "/" + day);
						
					}
				}
				, year, month, day);
}
	


}
