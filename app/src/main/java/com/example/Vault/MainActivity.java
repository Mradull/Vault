package com.example.Vault;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {
    private MeowBottomNavigation bottomNavigation;
    RelativeLayout home,gallery,month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottomNavigation);
        home = findViewById(R.id.home);
        gallery = findViewById(R.id.gallery);
        month = findViewById(R.id.month);
        bottomNavigation.show(2,true);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.baseline_insert_photo_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.baseline_calendar_month_24));

        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES
                switch(model.getId()){
                    case 1:
                        home.setVisibility(View.VISIBLE);
                        gallery.setVisibility(View.GONE);
                        month.setVisibility(View.GONE);
                        break;
                    case 2:
                        home.setVisibility(View.GONE);
                        gallery.setVisibility(View.VISIBLE);
                        month.setVisibility(View.GONE);
                        break;
                    case 3:
                        home.setVisibility(View.GONE);
                        gallery.setVisibility(View.GONE);
                        month.setVisibility(View.VISIBLE);
                        break;

                }
                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES
                switch (model.getId()){
                    case 1:
                        home.setVisibility(View.VISIBLE);
                        gallery.setVisibility(View.GONE);
                        month.setVisibility(View.GONE);
                        break;
                }
                return null;
            }
        });
        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES
                switch (model.getId()){
                    case 2:
                        home.setVisibility(View.GONE);
                        gallery.setVisibility(View.VISIBLE);
                        month.setVisibility(View.GONE);
                        break;
                }
                return null;
            }
        });
        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES
                switch (model.getId()){
                    case 3:
                        home.setVisibility(View.GONE);
                        gallery.setVisibility(View.GONE);
                        month.setVisibility(View.VISIBLE);
                        break;
                }
                return null;
            }
        });
    }
}