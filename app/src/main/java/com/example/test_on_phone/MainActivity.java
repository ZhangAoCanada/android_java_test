package com.example.test_on_phone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
//import android.util.Log;
import android.view.View;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    /** Example for android broadcasting */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // broadcast a custom intent.
    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("HelloWorld"); sendBroadcast(intent);
    }

    /** Example for android service */
//    String msg = "Android : ";
//
//    /** Called when the activity is first created. */
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.d(msg, "The onCreate() event.");
//    }
//
//	public void startService(View view) {
//		startService(new Intent(getBaseContext(), MyService.class));
//	}
//
//	//Method to stop the service
//	public void stopService(View view) {
//		stopService(new Intent(getBaseContext(), MyService.class));
//	}

	/** Example for the android activities */
//    /** Called when the activity is about to become visible. */
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(msg, "The onStart() event.");
//    }
//
//    /** Called when the activity has become visible. */
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(msg, "The onResume() event.");
//    }
//
//    /** Called when another activity is taking focus. */
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(msg, "The onPause() event.");
//    }
//
//    /** Called when the activity is no longer visible. */
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(msg, "The onStop() event.");
//    }
//
//    /** Called just before the activity is destroyed. */
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(msg, "The onDestroy() event.");
//    }
}

