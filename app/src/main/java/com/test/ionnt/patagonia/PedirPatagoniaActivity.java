package com.test.ionnt.patagonia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Martin De Girolamo on 4/8/17.
 */

public class PedirPatagoniaActivity extends AppCompatActivity {
    @BindView(R.id.addBeer) ImageView addBeer1;
    @BindView(R.id.addBeer2) ImageView addBeer2;
    @BindView(R.id.addBeer3) ImageView addBeer3;
    @BindView(R.id.lessBeer) ImageView lessBeer1;
    @BindView(R.id.lessBeer2) ImageView lessBeer2;
    @BindView(R.id.lessBeer3) ImageView lessBeer3;
    @BindView(R.id.qty_beer1) TextView mQtyBeerText1;

    private int mQty_beer1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedir_patagonia_activity);

        ButterKnife.bind(this);

        addBeer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer1++;
                mQtyBeerText1.setText(String.valueOf(mQty_beer1));
            }
        });
    }
}
