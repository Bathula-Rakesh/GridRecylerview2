package com.example.gridrecylerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class GridviewAdapter extends RecyclerView.Adapter<GridviewAdapter.viewholder> {
    Context context;
    List<CustomModelClass> customModelClasses = new ArrayList<>();

    public GridviewAdapter(Context context, List<CustomModelClass> customModelClasses) {
        this.context = context;
        this.customModelClasses = customModelClasses;
    }

    @NonNull
    @Override
    public GridviewAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customdesign,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridviewAdapter.viewholder holder, int position) {
        holder.imageView.setImageResource(customModelClasses.get(position).getItem());
        holder.textView.setText(customModelClasses.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return customModelClasses.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.item_iv);
            textView =itemView.findViewById(R.id.name_tv);
        }
    }
}
