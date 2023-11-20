package com.example.home_work33_20;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder>{

    private ArrayList<String> numberlist;

    public NumberAdapter(ArrayList<String> numberlist){
        this.numberlist = numberlist;
    }
    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(numberlist.get(position));
    }

    @Override
    public int getItemCount() {
        return numberlist.size();
    }
}
