package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        ImageButton true_btn_2=findViewById(R.id.trueButton_2);
        ImageButton false_btn_2=findViewById(R.id.falseButton_2);
        Button seeWhy_btn_2=findViewById(R.id.btn_2);

        seeWhy_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tutorialspoint.com/Constructor-overloading-in-Java#:~:text=Yes!,with%20different%20no%20of%20parameters.");
            }
        });

        false_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQ3();
            }
        });
        true_btn_2.setOnClickListener(this);
    }
    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void openQ3(){
        Intent intent=new Intent(this,Question3.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Question2.this,"Wrong answer!!",Toast.LENGTH_LONG).show();
    }


}