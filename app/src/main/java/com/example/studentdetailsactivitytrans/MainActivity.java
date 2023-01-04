package com.example.studentdetailsactivitytrans;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // define the variable
    Button send_button;
    EditText send_FN,send_MN,send_LN,send_DOB,send_ADDR,send_EMAIL;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button = findViewById(R.id.send_button_id);
        send_FN = findViewById(R.id.idFirstName);
        send_MN = findViewById(R.id.idMiddleName);
        send_LN = findViewById(R.id.idLastName);
        send_DOB = findViewById(R.id.idDOB);
        send_ADDR = findViewById(R.id.idAddress);
        send_EMAIL = findViewById(R.id.idEmail);

        // add the OnClickListener in sender button after clicked this button following Instruction will run
        send_button.setOnClickListener(v -> {
            // get the value which input by user in EditText and convert it to string
            String strfn = send_FN.getText().toString();
            String strmn = send_MN.getText().toString();
            String strln = send_LN.getText().toString();
            String strdob = send_DOB.getText().toString();
            String straddr = send_ADDR.getText().toString();
            String stremail = send_EMAIL.getText().toString();


            // Create the Intent object of this class Context() to Second_activity class
            Intent intent = new Intent(getApplicationContext(), MainActivitySec.class);
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("message_key1", strfn);
            intent.putExtra("message_key2", strmn);
            intent.putExtra("message_key3", strln);
            intent.putExtra("message_key4", strdob);
            intent.putExtra("message_key5", straddr);
            intent.putExtra("message_key6", stremail);

            // start the Intent
            startActivity(intent);
        });
    }
}
