package com.may6.first;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class SavePreferencesActivity extends Activity {
	 private static final String TWITTER_PREFS = "twitter";
	 EditText  editName, editPassword;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sharedprefs);
	        editName = (EditText)  this.findViewById(R.id.editName);
	        editPassword = (EditText)  this.findViewById(R.id.editPassword);	        
	    }
	 
	    public void savePrefs(View v) {
	    	
	    	SharedPreferences  twitterprefs = this.getSharedPreferences( TWITTER_PREFS, 
	    			           Context.MODE_PRIVATE );  //1
	    	
	    	SharedPreferences.Editor editor = twitterprefs.edit();  //2
	    
	    	editor.putString("uname",  editName.getText().toString());  // 3
	    	editor.putString("password",  editPassword.getText().toString());
	    	editor.commit();  // 4
	    	Toast.makeText(this,"Saved Preferences", Toast.LENGTH_LONG).show();
	    }
			 

	    public void showPrefs(View v) {
	    	SharedPreferences  twitterprefs = this.getSharedPreferences( TWITTER_PREFS, 
			         Context.MODE_PRIVATE );
	    	String uname = twitterprefs.getString("uname","srikanth");
	    	String password = twitterprefs.getString("password","");
	    	
	    	Toast.makeText(this,
	    			 String.format("Uname : %s\nPassword : %s", uname,password),
  					 Toast.LENGTH_LONG).show();
	    	
	    	
	    }
	    
	    
	    
	    
}


















