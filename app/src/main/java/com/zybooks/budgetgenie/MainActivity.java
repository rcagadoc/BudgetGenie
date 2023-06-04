package com.zybooks.budgetgenie;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.*;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.bottom_nav);
    }

    CalculatorFragment calculatorFragment = new CalculatorFragment();
    CostModelFragment costModelFragment = new CostModelFragment();
    AccountFragment accountFragment = new AccountFragment();


    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {

        switch (item.getItemId()) {
            case R.id.calculator:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.relativelayout, calculatorFragment)
                        .commit();
                return true;

            case R.id.cost_model:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.relativelayout, costModelFragment)
                        .commit();
                return true;

            case R.id.account:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.relativelayout, accountFragment)
                        .commit();
                return true;
        }
        return false;
    }
}
