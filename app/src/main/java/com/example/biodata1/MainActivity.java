package com.example.biodata1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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

        CardView cv = findViewById(R.id.profile1);
        cv.setBackground(getResources().getDrawable(R.drawable.ppgrad));

        Typeface tf = ResourcesCompat.getFont(
                this,
                R.font.nunito);

        TextView[] txt = new TextView[26];

        for(int i = 1; i <= 26; i++) {
            String id = (String)("text" + i);
            int idd = getResources().getIdentifier(id, "id", getPackageName());
            txt[i-1] = ((TextView) findViewById(idd));
        }

        for(int i = 1; i <= 26; i++) {
            txt[i-1].setTypeface(tf);
        }

    }
}