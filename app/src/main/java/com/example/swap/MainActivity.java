package com.example.swap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Swap(View v) {
        EditText sw1, sw2,temp;
        sw1 = (EditText) findViewById(R.id.s1);
        sw2 = (EditText) findViewById(R.id.s2);
        String str = sw1.getText().toString();
        String str1 = sw2.getText().toString();
        temp=sw1;
        sw1=sw2;
        sw2=temp;
        sw1.setText(str);
        sw2.setText(str1);
    }

}