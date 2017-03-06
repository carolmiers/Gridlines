package com.example.android.gridlines;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.gridlines.R.string.Motivator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String fontPath = "fonts/SourceSerifPro-Regular.ttf";
        TextView textView = (TextView)findViewById(R.id.motivator);
        Typeface typeFace = Typeface.createFromAsset(getAssets(),fontPath);
        textView.setTypeface(typeFace);
    }
}

