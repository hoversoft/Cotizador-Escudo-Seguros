package com.agustinsoria.cotizadorescudoseguros;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joel on 22/12/2016.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    List<Category> categories;

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView title;
        TextView types;
        TextView price;

        CardViewHolder(View view) {
            super(view);
            cv = (CardView)view.findViewById(R.id.categoryCard);
            title = (TextView)view.findViewById(R.id.titleCard);
            types = (TextView)view.findViewById(R.id.itemsCard);
            price = (TextView)view.findViewById(R.id.priceCard);
        }
    }


    CardAdapter(List<Category> categories){
        this.categories = categories;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_category, viewGroup, false);
        CardViewHolder cvh = new CardViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder,int i) {
        String title = categories.get(i).title;
        String price = new StringBuilder("$").append(Float.toString(categories.get(i).price)).toString();
        String types = "";

        for (Type type : categories.get(i).type) {
            types += type.name + System.getProperty("line.separator");
        }

        cardViewHolder.title.setText(title);
        cardViewHolder.types.setText(types);
        cardViewHolder.price.setText(price);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}