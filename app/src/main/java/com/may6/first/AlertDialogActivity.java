package com.may6.first;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertDialogActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alter_dialog);
	}

	public void showAlert(View v) {
		showDialog(1);
	}
	@Override
	protected Dialog onCreateDialog(int id) {
			return getAlertDialog();
	}
	
	public Dialog getAlertDialog() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Do you want to quit dialog?");
		builder.setCancelable(false);
		builder.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								Toast.makeText(AlertDialogActivity.this,
										"You selected yes", Toast.LENGTH_LONG)
										.show();
							}
						});
		builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						Toast.makeText(AlertDialogActivity.this,
								"You selected No", Toast.LENGTH_LONG)
								.show();
						
					}
				});
		builder.setTitle("Confirmation");
		builder.setIcon( R.drawable.save);
		return builder.create(); // create Dialog
	}
   
}
