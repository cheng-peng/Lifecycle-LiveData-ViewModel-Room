package com.cxp.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    private  MyViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.main_tv);

        model= ViewModelProviders.of(this).get(MyViewModel.class);
        model.getUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(@Nullable List<User> users) {

                tv.setText("name:"+users.get(0).getName()+",age:"+users.get(0).getAge());

                for (int i = 0; i < users.size(); i++) {
                    Log.e("CXP","name:"+users.get(i).getName()+",age:"+users.get(i).getAge());
                }
            }
        });

        //初始化数据
        initData();
    }

    //初始化数据
    private void initData() {
        List<User> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user=new User();
            user.setUserId(""+i);
            user.setName("CXP"+i);
            user.setAge(18+i);
            list.add(user);
        }
        model.getUsers().setValue(list);
    }
}
