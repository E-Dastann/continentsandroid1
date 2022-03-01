package com.example.continents;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterName extends RecyclerView.Adapter<AdapterName.ViewHolderName> {
    private ArrayList<Model> data;
    private OnClickListener listener;

    public AdapterName(ArrayList<Model> data, OnClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolderName onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderName(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlogo, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderName holder, @SuppressLint("RecyclerView") int position) {
        holder.nameContinent(data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(data.get(position).getTextView());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolderName extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textViewCity;

        public ViewHolderName(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_content);
            imageView = itemView.findViewById(R.id.image_name);

        }

        public void nameContinent(Model model) {
            textView.setText(model.getTextView());
            imageView.setImageResource(model.getImageView());

        }
    }
}
