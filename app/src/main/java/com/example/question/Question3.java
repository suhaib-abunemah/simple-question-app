package com.example.question;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Question3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);


        initListener();
    }

    private void initListener() {
        ImageButton buttonTrue = findViewById(R.id.trueButton_3);
        ImageButton buttonFalse = findViewById(R.id.falseButton_3);
        Button buttonSeeWhy = findViewById(R.id.btn_3);

        buttonSeeWhy.setOnClickListener(v ->
                gotoUrl("https://runestone.academy/ns/books/published/thinkcspy/SimplePythonData/VariableNamesandKeywords.html#:~:text=Variable%20names%20can%20be%20arbitrarily,by%20convention%20we%20don't."));

        buttonTrue.setOnClickListener(view -> {
            showAlertDialog("Congrats!");
        });

        buttonFalse.setOnClickListener(this);
    }

    private void showAlertDialog(String message) {
        AlertDialog dialog = new AlertDialog.Builder(Question3.this)
                .setTitle("")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
        dialog.show();
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(Question3.this, "Wrong answer!!", Toast.LENGTH_LONG).show();
    }
}