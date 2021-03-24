package com.example.test_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String str = intent.getExtras().getString("키");
//        Log.d("로그", str);
//        EditText editText = findViewById(R.id.edit_text);
//        editText.setText(str);
        ((EditText)findViewById(R.id.edit_text)).setText(str);
    }
}