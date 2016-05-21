package com.may6.first;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class NotifyActivity extends Activity {
    int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notify);
	}
	
   public void sendNotification2(View v) {
		NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		Notification n = new Notification();
		n.icon = R.drawable.open;
		n.tickerText = "Ticket text";
		n.number = 1;
		Intent notificationIntent = new Intent(this, HelloActivity.class);
		PendingIntent contentIntent =  PendingIntent.getActivity(this, 1, notificationIntent,0);
		// n.setLatestEventInfo(this, "Title", "Text", contentIntent);
		nm.notify(1,n);
	}


	public void sendNotificationWithBuilder(View v) {

		NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

		NotificationCompat.Builder b = new NotificationCompat.Builder(this);
		b.setSmallIcon( R.drawable.save);
		Bitmap bm = BitmapFactory.decodeResource( getResources(), R.drawable.john);
        b.setLargeIcon(bm);
	    Intent notificationIntent = new Intent(this, HelloActivity.class);
		PendingIntent contentIntent =  PendingIntent.getActivity(this, 1, notificationIntent,0);
		b.setContentIntent(contentIntent);

		b.setContentText("Context Text");
		b.setContentTitle("Content Title");
		b.setTicker( "Ticket Text");

		b.setDefaults( Notification.DEFAULT_SOUND);
		b.setWhen(System.currentTimeMillis());
		b.setNumber(++count);
		nm.notify(2, b.build());
	}



}
