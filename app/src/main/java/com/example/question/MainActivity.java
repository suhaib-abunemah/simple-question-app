package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton true_btn=findViewById(R.id.trueButton);
        ImageButton false_btn=findViewById(R.id.falseButton);
        Button seeWhy_btn=findViewById(R.id.btn);

        seeWhy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.techtarget.com/searchstorage/definition/garbage-collection");
            }
        });

        false_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQ2();
            }
        });
        true_btn.setOnClickListener(this);
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void openQ2(){
        Intent intent=new Intent(this,Question2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Wrong answer!!",Toast.LENGTH_LONG).show();
    }

}