package com.test.ionnt.patagonia;

import android.content.Intent;
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

public class RecomendationPopup extends AppCompatActivity {
    @BindView(R.id.okBtn) Button mButtonOk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_recomendation_beer);

        ButterKnife.bind(this);

        mButtonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent mainActivity = new Intent(getApplication(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
