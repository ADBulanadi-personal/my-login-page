package com.example.android.lifecycles.View;

import androidx.appcompat.app.AppCompatActivity;


import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.text.TextUtils;
import android.content.Intent;


import com.example.android.lifecycles.Model.LoginUser;
import com.example.android.codelabs.lifecycle.R;

import com.example.android.codelabs.lifecycle.databinding.ActivityMainBinding;
import com.example.android.lifecycles.ViewModel.LoginViewModel;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    private LoginViewModel loginViewModel;

    private ActivityMainBinding binding;

    @Override
   protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

            binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

            binding.setLifecycleOwner(this);

            binding.setLoginViewModel(loginViewModel);
            loginButton = findViewById(R.id.LoginButton);
            loginViewModel.getUser().observe(this, new Observer<LoginUser>() {
                @Override
                public void onChanged(@Nullable LoginUser loginUser) {

                    if (TextUtils.isEmpty(Objects.requireNonNull(loginUser).getStrUsername())) {
                        binding.username.setError("Enter an Username");
                        binding.username.requestFocus();
                    }
                }
            });

            loginButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    if(username.getText().toString().equals("user") && password.getText().toString().equals("admin123")) {
                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
}