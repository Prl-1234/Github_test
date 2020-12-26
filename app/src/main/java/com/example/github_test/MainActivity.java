package com.example.github_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView s=(TextView) findViewById(R.id.last);
        s.setVisibility(View.GONE);
        s.setVisibility(View.VISIBLE);
        s.setVisibility(View.GONE);

    }
}