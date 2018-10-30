package com.lab.pdoffice.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        et = findViewById(R.id.editText);
        bt = findViewById(R.id.button);
        setSupportActionBar(toolbar);

    }

    public void btclick(View v){
        Toast.makeText(getApplicationContext(),"Button is clicked!",Toast.LENGTH_SHORT).show();
        String s=et.getText().toString();
        Toast.makeText(getApplicationContext(),"The text is:"+s,Toast.LENGTH_SHORT).show();
        Intent in = new Intent(MainActivity.this,SecondActivity.class);
        in.putExtra("et",s);
        startActivityForResult(in,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra("Message");
                Toast.makeText(getApplicationContext(), "The text is:" + reply, Toast.LENGTH_SHORT).show();

            }

        }
    }
}
