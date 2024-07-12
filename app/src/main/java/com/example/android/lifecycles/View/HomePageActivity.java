package com.example.android.lifecycles.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.android.codelabs.lifecycle.R;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
}