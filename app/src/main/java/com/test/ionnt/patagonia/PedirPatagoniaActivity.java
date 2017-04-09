package com.test.ionnt.patagonia;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
    @BindView(R.id.qty_beer2) TextView mQtyBeerText2;
    @BindView(R.id.qty_beer3) TextView mQtyBeerText3;
    @BindView(R.id.pint1) ImageView mPintSelect1;
    @BindView(R.id.pint2) ImageView mPintSelect2;
    @BindView(R.id.pint3) ImageView mPintSelect3;
    @BindView(R.id.conductor_designado) Button mConductorDesignado;
    @BindView(R.id.nosequepedir) Button mNoseQuePedir;

    private int mQty_beer1;
    private int mQty_beer2;
    private int mQty_beer3;
    private boolean mBeerSel1;
    private boolean mBeerSel2;
    private boolean mBeerSel3;

    public PedirPatagoniaActivity() {
        mBeerSel1 = false;
        mBeerSel2 = false;
        mBeerSel3 = false;
    }

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

        addBeer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer2++;
                mQtyBeerText2.setText(String.valueOf(mQty_beer2));
            }
        });

        addBeer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer3++;
                mQtyBeerText3.setText(String.valueOf(mQty_beer3));
            }
        });

        lessBeer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer1--;
                mQtyBeerText1.setText(String.valueOf(mQty_beer1));
            }
        });

        lessBeer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer2--;
                mQtyBeerText2.setText(String.valueOf(mQty_beer2));
            }
        });

        lessBeer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQty_beer3--;
                mQtyBeerText3.setText(String.valueOf(mQty_beer3));
            }
        });

        mPintSelect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mBeerSel1) {
                    mPintSelect1.setImageResource(R.drawable.pint_full);
                    mBeerSel1 = true;
                }else {
                    mPintSelect1.setImageResource(R.drawable.pinta);
                    mBeerSel1 = false;
                }

            }
        });

        mPintSelect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mBeerSel2) {
                    mPintSelect2.setImageResource(R.drawable.pint_full);
                    mBeerSel2 = true;
                }else {
                    mPintSelect2.setImageResource(R.drawable.pinta);
                    mBeerSel2 = false;
                }

            }
        });

        mPintSelect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mBeerSel3) {
                    mPintSelect3.setImageResource(R.drawable.pint_full);
                    mBeerSel3 = true;
                }else {
                    mPintSelect3.setImageResource(R.drawable.pinta);
                    mBeerSel3 = false;
                }

            }
        });

        mConductorDesignado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conductorActivity = new Intent(getApplication(), ConductorActivity.class);
                startActivity(conductorActivity);
            }
        });

        mNoseQuePedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noSeQuePedir = new Intent(getApplication(), AdviceBeer1Activity.class);
                startActivity(noSeQuePedir);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
