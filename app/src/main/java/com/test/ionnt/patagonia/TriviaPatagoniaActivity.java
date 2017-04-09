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

public class TriviaPatagoniaActivity extends AppCompatActivity {
    @BindView(R.id.answerBtn1) Button mAnswer1;
    @BindView(R.id.answerBtn2) Button mAnswer2;
    @BindView(R.id.answerBtn3) Button mAnswer3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_patagonia_activity);

        ButterKnife.bind(this);

        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Correct Answer
                mAnswer1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0x00AACC33));
                Intent correctAnswerActivity = new Intent(getApplication(), CorrectAnswerActivity.class);
                startActivity(correctAnswerActivity);
            }
        });

        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnswer2.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
                Intent errorAnswerActivity = new Intent(getApplication(), ErrorAnswerActivity.class);
                startActivity(errorAnswerActivity);
            }
        });

        mAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnswer3.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
                Intent correctAnswerActivity = new Intent(getApplication(), ErrorAnswerActivity.class);
                startActivity(correctAnswerActivity);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
