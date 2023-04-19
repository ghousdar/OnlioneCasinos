package com.example.onlionecasinos.ui.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.onlionecasinos.ReviewActivity;
import com.example.onlionecasinos.databinding.ImagelayoutBinding;

import java.util.ArrayList;

public class HorizontalListAdapter extends RecyclerView.Adapter<HorizontalListAdapter.ViewHolder> {


    private ImagelayoutBinding binding;
    private CountryModel[] mModels;
    private Context context;

    public HorizontalListAdapter(Context context, CountryModel[] mModels) {
        this.context = context;
        this.mModels = mModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ImagelayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalListAdapter.ViewHolder holder, int position) {
        CountryModel model = mModels[position];

        Glide.with(context).load(model.getImageResource())

                .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.binding.catImage);

        binding.catImage.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), ReviewActivity.class);
            intent.putExtra("banner_image", model.getImageResource());
            intent.putExtra("icon_image", model.getIconResource());
            intent.putExtra("rating", model.getCasinorating());
            intent.putExtra("review", model.getReview());
            intent.putExtra("brand", model.getCasinoBrand());
            v.getContext().startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return mModels.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImagelayoutBinding binding;

        public ViewHolder(@NonNull ImagelayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
