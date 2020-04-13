package com.example.test_on_phone;

import android.hardware.Camera;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

import android.content.Context;
import android.content.pm.PackageManager;

import android.view.View;

import android.widget.FrameLayout;

import android.media.MediaRecorder;
import android.media.MediaPlayer;

import java.io.IOException;

public class MainActivity extends Activity {
    private Camera mCamera;
    private CameraPreview mPreview;
    public boolean cam_status;

    /** Check if this device has a camera */
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    /** A safe way to get an instance of the Camera object. */
    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)

        }
        return c; // returns null if camera is unavailable
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an instance of Camera
        mCamera = getCameraInstance();

        // Create our Preview view and set it as the content of our activity.
        mPreview = new CameraPreview(this, mCamera);
        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(mPreview);
    }
}