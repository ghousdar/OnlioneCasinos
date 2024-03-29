package com.brands.cardgu;

import static android.view.View.GONE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.brands.cardgu.databinding.ActivityHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // Get the SharedPreferences object
        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        data = sharedPreferences.getString("country", "");


        if (data.equals("USA")) {
            // Load the image for English language
            binding.imageGetNow.setImageResource(R.drawable.joinnow_english);
        } else if (data.equals("Canada")) {
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_english);
        }
        else if (data.equals("Australia")) {
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_english);
        }
        else if (data.equals("Brazil")) {
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_brazil);
        } else if (data.equals("France")) {
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_france);
        } else if (data.equals("Germany")) {
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_german);
        } else if (data.equals("Italy")) {//
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_italy);
        } else if (data.equals("Russia")) {//
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_russia);
        } else if (data.equals("Spain")) {//
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_spain);
        } else if (data.equals("Others")) {//
            // Load the image for other languages
            binding.imageGetNow.setImageResource(R.drawable.joinnow_english);
        }

        BottomNavigationView navView = findViewById(R.id.nav_view);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_home);

        NavigationUI.setupWithNavController(binding.navView, navController);

        binding.btnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.fragmentContainer.setVisibility(GONE);
                binding.navView.setVisibility(View.VISIBLE);


            }
        });

        binding.imageGetNow.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://listmake.shop"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        binding.joinNow.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://listmake.shop"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        binding.fragmentContainer.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onStart() {
//        binding.fragmentContainer.setVisibility(View.VISIBLE);
        super.onStart();
    }

    @Override
    protected void onResume() {
//        binding.fragmentContainer.setVisibility(View.VISIBLE);
        super.onResume();
    }

    @Override
    protected void onRestart() {
//        binding.fragmentContainer.setVisibility(View.VISIBLE);
        super.onRestart();

    }
}