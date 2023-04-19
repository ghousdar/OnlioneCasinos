package com.example.onlionecasinos;

import static android.view.View.GONE;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.onlionecasinos.ui.dashboard.DashboardFragment;
import com.example.onlionecasinos.ui.home.HomeFragment;
import com.example.onlionecasinos.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.onlionecasinos.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();




//// Set the item selection listener
//// Set the item selection listener
//        navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                // Handle the item selection event
//                switch (item.getItemId()) {
//                    case R.id.navigation_home:
//                        // Load the HomeFragment
//                        getSupportFragmentManager().beginTransaction()
//                                .replace(R.id.fragment_container, new HomeFragment())
//                                .commit();
//                        return true;
//                    case R.id.navigation_dashboard:
//                        // Load the DashboardFragment
//                        getSupportFragmentManager().beginTransaction()
//                                .replace(R.id.fragment_container, new DashboardFragment())
//                                .commit();
//                        return true;
//                    case R.id.navigation_notifications:
//                        // Load the NotificationsFragment
//                        getSupportFragmentManager().beginTransaction()
//                                .replace(R.id.fragment_container, new NotificationsFragment())
//                                .commit();
//                        return true;
//                }
//                return false;
//            }
//        });





        binding.btnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.fragmentContainer.setVisibility(GONE);
                binding.navView.setVisibility(View.VISIBLE);



            }
        });

        binding.myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://listmake.shop"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

}