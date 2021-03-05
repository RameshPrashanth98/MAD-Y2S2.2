package com.example.check4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View v){
            TextView T1 = findViewById(R.id.fname);
            String first = T1.getText().toString();
            TextView T2 = findViewById(R.id.lname);
            String last = T2.getText().toString();
            String full = "Hello "+first +" "+ last;

        ((TextView)findViewById(R.id.you)).setText(full);
      //  Toast.makeText(context: this,resld:"Alert",Toast.LENGTH_LONG).show();

    }
}