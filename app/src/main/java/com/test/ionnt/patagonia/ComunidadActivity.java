package com.test.ionnt.patagonia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Martin De Girolamo on 4/9/17.
 */

public class ComunidadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comunidad_activity);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
