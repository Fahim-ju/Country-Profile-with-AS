package com.example.countryprofileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        imageView = findViewById(R.id.countryImage);
        textView = findViewById(R.id.countryDetails);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            String value = bundle.getString("name");
            textView.setText(value);
            showDetails(value);
        }

    }

    void showDetails(String s)
    {
        if(s.equals("Bangladesh"))
        {
            textView.setText(R.string.bdDetails);
            imageView.setImageResource(R.drawable.bd);
        }
        else if(s.equals("India"))
        {
            textView.setText(R.string.indiaDetails);
            imageView.setImageResource(R.drawable.in);

        }
        else if(s.equals("Pakistan"))
        {
            textView.setText(R.string.pakDetails);
            imageView.setImageResource(R.drawable.pak);

        }
    }

}