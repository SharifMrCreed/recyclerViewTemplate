package com.alle.san.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemRvAdapter extends RecyclerView.Adapter<ItemRvAdapter.ItemViewHolder> {
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.Bind();
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView songName, artistName;
        RelativeLayout songItem;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            songName = itemView.findViewById(R.id.song_name);
            artistName = itemView.findViewById(R.id.artist_name);
        }

        public void Bind() {
            songName.setText("Serafin");
            artistName.setText("Im currently living in Australia");

        }

    }

}
