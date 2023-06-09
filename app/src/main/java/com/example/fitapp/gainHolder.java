package com.example.fitapp;

import android.content.ClipData;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class gainHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView mImage;
    TextView mTitle, mDescription;
    CheckBox mCheckbox;

    ItemClickListener itemClickListener;
    public gainHolder(@NonNull View itemView){
        super(itemView);
        this.mImage = itemView.findViewById(R.id.logo);
        this.mTitle = itemView.findViewById(R.id.title);
        this.mDescription = itemView.findViewById(R.id.description);

        mCheckbox = itemView.findViewById(R.id.workbox);
        mCheckbox.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.OnItemClick(v,getLayoutPosition());
    }
}

