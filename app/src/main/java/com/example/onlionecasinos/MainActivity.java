package com.example.onlionecasinos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.onlionecasinos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
// Get the SharedPreferences object
        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);

// Get an editor to modify the SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();




        binding.usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "USA");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "Australia");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "Canada");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.germany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "Germany");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "France");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("country", "Brazil");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);
            }
        });


        binding.russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "Russia");
                editor.apply();


                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);

            }
        });


        binding.italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("country", "Italy");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);

            }
        });

        binding.spain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("country", "Spain");
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);

            }
        });


        binding.other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("country", "Others");
                editor.apply();
//                Intent intent = new Intent(MainActivity.this,Home.class);
//                intent.putExtra("country", "Italy");

                Intent intent = new Intent(MainActivity.this, Home.class);

                startActivity(intent);

            }
        });


    }
}