package com.example.shalatreminder;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SholatAdapter extends RecyclerView.Adapter<SholatAdapter.ViewHolder> {
    Context context;
    List<SholatModel> sholatModels = new ArrayList<>();

    public SholatAdapter(Context context, List<SholatModel> sholatModels){
        this.context = context;
        this.sholatModels = sholatModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvDate.setText(sholatModels.get(i).getDate());
        viewHolder.tvShubuh.setText(sholatModels.get(i).getShubuh());
        viewHolder.tvDhuhur.setText(sholatModels.get(i).getDhuhur());
        viewHolder.tvAshar.setText(sholatModels.get(i).getAshar());
        viewHolder.tvMaghrib.setText(sholatModels.get(i).getMaghrib());
        viewHolder.tvIsya.setText(sholatModels.get(i).getIsya());
        viewHolder.ivSholat.setImageResource(sholatModels.get(i).getGambar());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailSholat.class);
                intent.putExtra("date", sholatModels.get(i).getDate());
                intent.putExtra("shubuh", sholatModels.get(i).getShubuh());
                intent.putExtra("dhuhur", sholatModels.get(i).getDhuhur());
                intent.putExtra("ashar", sholatModels.get(i).getAshar());
                intent.putExtra("maghrib", sholatModels.get(i).getMaghrib());
                intent.putExtra("isya", sholatModels.get(i).getGambar());
                context.startActivity(intent);
                Toast.makeText(context, sholatModels.get(i).getDate(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return sholatModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDate, tvShubuh, tvAshar, tvDhuhur, tvMaghrib, tvIsya ;
        ImageView ivSholat;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivSholat = itemView.findViewById(R.id.ivsholat);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvShubuh = itemView.findViewById(R.id.tv_shubuh);
            tvDhuhur = itemView.findViewById(R.id.tv_dhuhur);
            tvAshar = itemView.findViewById(R.id.tv_ashar);
            tvMaghrib = itemView.findViewById(R.id.tv_maghrib);
            tvIsya = itemView.findViewById(R.id.tv_isya);
        }
    }
}
