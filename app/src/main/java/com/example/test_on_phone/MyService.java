package com.example.test_on_phone;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import android.widget.Toast;

public class MyService extends Service {
	@NonNull
	@Override
	public IBinder onBind(Intent intent) {
			return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
			// Let it continue running until it is stopped.
			Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
			return START_STICKY;
	}

	@Override
	public void onDestroy() {
			super.onDestroy();
			Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
	}
}
