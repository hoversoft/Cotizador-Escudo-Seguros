package com.agustinsoria.cotizadorescudoseguros;

/**
 * Created by Joel on 16/12/2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CotizadorActivity extends AppCompatActivity {

    private RecyclerView rv;
    private List<Category> categories;
    private List<Type> respCivilTypes;
    private List<Type> roboTypes;

    Type granizo;
    Type incendio;
    Type terceros;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizador);

        rv = (RecyclerView)findViewById(R.id.cardList);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initType();
        initCategory();
        initAdapter();
    }

    private void initType(){
        granizo = new Type("Granizo");
        incendio = new Type("Incendio");
        terceros = new Type("Terceros");
    }

    private void initCategory(){
        respCivilTypes = new ArrayList<Type>();
        roboTypes = new ArrayList<Type>();
        categories = new ArrayList<Category>();

        respCivilTypes.add(granizo);
        respCivilTypes.add(terceros);

        roboTypes.add(terceros);
        roboTypes.add(incendio);

        categories.add(new Category("Responsabilidad Civil", respCivilTypes , 340));
        categories.add(new Category("Robo", roboTypes , 480));
    }

    private void initAdapter(){
        CardAdapter adapter = new CardAdapter(categories);
        rv.setAdapter(adapter);
    }

    public void cotizar(){

    }
}