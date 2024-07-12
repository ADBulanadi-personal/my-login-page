package com.example.android.lifecycles.ViewModel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.content.Intent;
import android.view.View;

import com.example.android.lifecycles.Model.LoginUser;
import com.example.android.lifecycles.View.HomePageActivity;
import com.example.android.lifecycles.View.MainActivity;

import android.content.Intent;


public class LoginViewModel extends ViewModel {

    public MutableLiveData<String> Username = new MutableLiveData<>();
    public MutableLiveData<String> Password = new MutableLiveData<>();


    private MutableLiveData<LoginUser> userMutableLiveData;

    public MutableLiveData<LoginUser> getUser() {

        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;

    }

    public void onClick(View view) {

        LoginUser loginUser = new LoginUser(Username.getValue(), Password.getValue());

        userMutableLiveData.setValue(loginUser);


    }

}