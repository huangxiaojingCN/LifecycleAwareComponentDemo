package com.hxj.lifecycleawarecomponentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Owner onCreate: ");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Owner onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Owner onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Owner onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Owner onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Owner onDestroy: ");
    }
}
