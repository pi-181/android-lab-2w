package com.demkom58.androidlab2w;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ImageView buttonSleep;
    private ImageView buttonDate;
    private ImageView buttonSport;
    private ImageView buttonStudy;
    private ImageView buttonQuest;
    private ImageView buttonStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        buttonSleep = findViewById(R.id.sleepButton);
        buttonSleep.setOnClickListener(createActivityButton(SleepActivity.class));
        buttonDate = findViewById(R.id.dateButton);
        buttonDate.setOnClickListener(createActivityButton(DateActivity.class));
        buttonSport = findViewById(R.id.sportButton);
        buttonSport.setOnClickListener(createActivityButton(SportActivity.class));
        buttonStudy = findViewById(R.id.studyButton);
        buttonStudy.setOnClickListener(createActivityButton(StudyActivity.class));
        buttonQuest = findViewById(R.id.questButton);
        buttonQuest.setOnClickListener(createActivityButton(QuestActivity.class));
        buttonStats = findViewById(R.id.statsButton);
        buttonStats.setOnClickListener(createActivityButton(StatsActivity.class));
    }

    private View.OnClickListener createActivityButton(final Class<?> activityClass) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        };
    }

}