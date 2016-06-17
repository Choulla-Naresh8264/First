package com.may6.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends Activity {
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_third);
           
        } 
	 
      public void sendBack(View v) {
    	 
    	 Intent intent = getIntent();
    	 intent.putExtra("message","Value from Third Activity");
    	 setResult(Activity.RESULT_OK, intent);
   	     finish();
    	 
     }

}
