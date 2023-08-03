package com.brands.cardgu;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.brands.cardgu.databinding.ActivityReviewBinding;


public class ReviewActivity extends AppCompatActivity {

    ActivityReviewBinding binding;
    public String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();

//        setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitle(String.valueOf(getIntent().getStringExtra("brand")));
        binding.toolbar.setTitleTextColor(Color.parseColor("#FFFFFFFF"));
//        binding.toolbar.setTitleTextAppearance(this, R.style.Toolbar_TitleCentered);

        str = getIntent().getStringExtra("review");
        binding.banner.setImageResource(intent.getIntExtra("banner_image", 0));
        binding.iconImage.setImageResource(intent.getIntExtra("icon_image", 0));
        binding.rating.setText("Rating: " + String.valueOf(getIntent().getStringExtra("rating")));

        binding.review.setText(str.replace("\"", ""));

        binding.ivJoin.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://listmake.shop"); // missing 'http://' will cause crashed
            Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent1);
        });
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}