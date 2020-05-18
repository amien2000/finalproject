package com.myniaga.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesAndroidLib extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lib_android_jokes);

        //Intent intent = getIntent();

        //String stringJavaLib = intent.getStringExtra("stringJavaLib");

        //TextView textView = findViewById(R.id.androidLib_TextView);
        //textView.setText(stringJavaLib);

        String result = getIntent().getStringExtra("result");
        TextView textView = findViewById(R.id.androidLib_TextView);

        textView.setText(result);


    }
}
