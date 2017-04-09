package com.test.ionnt.patagonia;

import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Martin De Girolamo on 4/9/17.
 */

public class AdviceBeer4Activity extends AppCompatActivity {
    @BindView(R.id.answerBtn1) Button mAnswer1;
    @BindView(R.id.answerBtn2) Button mAnswer2;
    @BindView(R.id.answerBtn3) Button mAnswer3;

    private Intent mIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beer_advice4_activity);

        ButterKnife.bind(this);

        mIntent = new Intent(getApplication(), RecomendationPopup.class);

        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Correct Answer
                startActivity(mIntent);
            }
        });

        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(mIntent);
            }
        });

        mAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(mIntent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
