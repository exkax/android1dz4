package com.example.android1dz5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Model> list;
    public void updateData(ArrayList<Model> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView country, capital;
        private ImageView flag;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            country  = itemView.findViewById(R.id.tv1);
            capital  = itemView.findViewById(R.id.tv2);
            flag = itemView.findViewById(R.id.image);
        }

        public void bind(Model model) {
            flag.setImageResource(model.getFlag());
            capital.setText(model.getSecondTV());
            country.setText(model.getFirstTV());
        }
    }
}
