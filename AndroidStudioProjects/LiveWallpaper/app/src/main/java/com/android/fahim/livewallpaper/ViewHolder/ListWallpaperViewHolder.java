package com.android.fahim.livewallpaper.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.android.fahim.livewallpaper.Interface.ItemClickListener;
import com.android.fahim.livewallpaper.R;
import com.flaviofaria.kenburnsview.KenBurnsView;

/**
 * Created by root on 22/2/18.
 */

public class ListWallpaperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ItemClickListener itemClickListener;
    public ImageView wallpaper;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    public ListWallpaperViewHolder(View itemView) {
        super(itemView);
        wallpaper = (ImageView) itemView.findViewById(R.id.image);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());

    }
}
