package com.cardgu.onlionecasinos.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brands.cardgu.databinding.VerticallayoutBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.cardgu.onlionecasinos.ReviewActivity;


public class VerticalListAdapter extends RecyclerView.Adapter<VerticalListAdapter.ViewHolder> {

    VerticallayoutBinding binding;
    private CountryModel[] mModels;
    private Context context;

    public VerticalListAdapter(Context context, CountryModel[] mModels) {
        this.context = context;
        this.mModels = mModels;
    }

    @NonNull
    @Override
    public VerticalListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = VerticallayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalListAdapter.ViewHolder holder, int position) {
        CountryModel model = mModels[position];

        Glide.with(context).load(model.getIconResource())

                .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.binding.icon);

        binding.name.setText(model.getCasinoBrand());
        binding.rating.setText(model.getCasinorating());

        binding.cardClick.setOnClickListener(v -> {
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
        VerticallayoutBinding binding;

        public ViewHolder(@NonNull VerticallayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
