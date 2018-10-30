package com.lab.pdoffice.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.textView);
        b2=findViewById(R.id.b2);
        Intent in1=getIntent();
        String s1 = in1.getStringExtra("et");
        tv.setText(s1);
    }

    public void b2click(View v){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("Message", "Checking Return Intent");
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}
