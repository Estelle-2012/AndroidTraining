package com.example.estelle.activitydemo.surfaceviewtest;

import android.app.Activity;
import android.os.Bundle;

import com.example.estelle.activitydemo.R;

import io.reactivex.annotations.Nullable;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface);
    }
}
