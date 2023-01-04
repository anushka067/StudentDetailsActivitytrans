package com.example.studentdetailsactivitytrans;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySec extends AppCompatActivity {

    TextView receiver_msg1;
    TextView receiver_msg2;
    TextView receiver_msg3;
    TextView receiver_msg4;
    TextView receiver_msg5;
    TextView receiver_msg6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sec);

        receiver_msg1 = findViewById(R.id.received_value_id1);
        receiver_msg2 = findViewById(R.id.received_value_id2);
        receiver_msg3 = findViewById(R.id.received_value_id3);
        receiver_msg4 = findViewById(R.id.received_value_id4);
        receiver_msg5 = findViewById(R.id.received_value_id5);
        receiver_msg6 = findViewById(R.id.received_value_id6);
        // create the get Intent object
        Intent intent = getIntent();
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        String strfn = intent.getStringExtra("message_key1");
        String strmn = intent.getStringExtra("message_key2");
        String strln = intent.getStringExtra("message_key3");
        String strdob = intent.getStringExtra("message_key4");
        String straddr = intent.getStringExtra("message_key5");
        String stremail = intent.getStringExtra("message_key6");
        // display the string into textView
        receiver_msg1.setText(strfn);
        receiver_msg2.setText(strmn);
        receiver_msg3.setText(strln);
        receiver_msg4.setText(strdob);
        receiver_msg5.setText(straddr);
        receiver_msg6.setText(stremail);
    }
}
