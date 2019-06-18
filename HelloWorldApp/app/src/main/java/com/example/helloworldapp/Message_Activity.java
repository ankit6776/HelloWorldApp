package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Message_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=findViewById(R.id.display_message );
        textView.setText(message);
    }
}
