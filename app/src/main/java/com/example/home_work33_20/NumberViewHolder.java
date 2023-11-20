package com.example.home_work33_20;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView tvNumber;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNumber = itemView.findViewById(R.id.tv_number);
    }

    public void bind(String sport) {
        tvNumber.setText(sport);
    }
}

