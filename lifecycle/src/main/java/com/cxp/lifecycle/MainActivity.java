package com.cxp.lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxp.lifecycle.lifecycle.LifecycleFragment;
import com.cxp.lifecycle.lifecycle.LifecyleActivity;
import com.cxp.lifecycle.test.TestActivity;

public class MainActivity extends AppCompatActivity {


    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        LifecycleFragment fragment = new LifecycleFragment();
        ft.add(R.id.main_fl, fragment);
        ft.commit();

    }


    public void clickLis(View view) {
        switch (view.getId()) {
            case R.id.main_bt1:
                //测试
                TestActivity.startActivity(mContext);
                break;
            case R.id.main_bt2:
                //Lifecycle
                LifecyleActivity.startActivity(mContext);
                break;
        }
    }
}
