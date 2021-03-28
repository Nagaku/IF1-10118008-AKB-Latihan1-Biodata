package com.example.biodata1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Typeface tf = ResourcesCompat.getFont(
                this,
                R.font.nunito);
        TextView txt1 = findViewById(R.id.text1);
        TextView txt2 = findViewById(R.id.text2);
        TextView txt3 = findViewById(R.id.text3);
        txt1.setTypeface(tf);
        txt2.setTypeface(tf);
        txt3.setTypeface(tf);

    }
}