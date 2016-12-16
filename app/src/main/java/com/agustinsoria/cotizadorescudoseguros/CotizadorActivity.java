package com.agustinsoria.cotizadorescudoseguros;

/**
 * Created by Joel on 16/12/2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CotizadorActivity extends AppCompatActivity {

    private TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizador);
        text = (TextView)findViewById(R.id.textView);
    }

    public void load(View view){
        String temp = "Got it!";
        text.setText(temp);
    }
}