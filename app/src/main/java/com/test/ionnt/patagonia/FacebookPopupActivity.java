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

public class FacebookPopupActivity extends AppCompatActivity {
    @BindView(R.id.acceptBtn) Button btnAccept;
    @BindView(R.id.cancelBtn) Button btnCancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_login_facebook);

        ButterKnife.bind(this);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling Main Screen.
                Intent showMainActivity = new Intent(getApplication(), MainActivity.class);
                startActivity(showMainActivity);
                finishAffinity();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
