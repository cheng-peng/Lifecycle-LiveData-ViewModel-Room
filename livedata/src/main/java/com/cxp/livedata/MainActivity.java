package com.cxp.livedata;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxp.livedata.custom.MyLiveDataActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        LiveDataFragment fragment=new LiveDataFragment();
        ft.add(R.id.main_fl,fragment);
        ft.commit();


    }

    public void clickLis(View view) {
        MyLiveDataActivity.startActivity(MainActivity.this);
    }
}
