package com.demkom58.androidlab2w;

import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_sport);
    }
}