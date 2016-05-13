package com.may6.first;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FactorsActivity extends Activity {

	TextView textFactors;
	EditText editNumber;
	
	@Override
	protected void onCreate(Bundle data) {
		super.onCreate(data);
		setContentView(R.layout.activity_factors);
		textFactors = (TextView) findViewById(R.id.textFactors);
		editNumber = (EditText) findViewById(R.id.editNumber);
		
		if ( data != null) {
			 textFactors.setText(  data.getString("output"));
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("output",  textFactors.getText().toString());
	}

	public void getFactors(View v) {
		
		int num = Integer.parseInt(  editNumber.getText().toString());
		
		textFactors.setText("");
		for ( int i = 2; i <= num/2; i ++ ) {
			if ( num % i == 0 )
			   textFactors.append( i + "\n" );
			
		}
	}

}
