package com.example.android.cems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EventMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_main);
        Intent intent=getIntent();
        String value=intent.getStringExtra("key");
        TextView textView=(TextView)findViewById(R.id.main_event);
        textView.setText(value);
    }
}
