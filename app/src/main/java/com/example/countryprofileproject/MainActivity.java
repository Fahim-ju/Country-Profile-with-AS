package com.example.countryprofileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bangladeshButton,indiaButton,pakistanButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshButton = findViewById(R.id.bangladeshButtonId);
        indiaButton = findViewById(R.id.indiaButtonId);
        pakistanButton = findViewById(R.id.pakistanButtonId);
        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,CountryDetails.class);

        if(view.getId() == R.id.bangladeshButtonId)
        {
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        else if(view.getId() == R.id.indiaButtonId)
        {
            intent.putExtra("name","India");
            startActivity(intent);
        }
        else if(view.getId() == R.id.pakistanButtonId)
        {
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialogBuilder.setCancelable(false);
        alertdialogBuilder.setTitle("Alert");
        alertdialogBuilder.setMessage("Do you Want to exit?");
        alertdialogBuilder.setIcon(R.drawable.exit);
        alertdialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertdialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertdialogBuilder.create();
        alertDialog.show();
    }
}