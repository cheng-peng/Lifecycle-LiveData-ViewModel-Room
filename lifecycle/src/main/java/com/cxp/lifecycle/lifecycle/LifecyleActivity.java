package com.cxp.lifecycle.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cxp.lifecycle.R;

/**
 * 文 件 名: LifecyleActivity
 * 创 建 人: CXP
 * 创建日期: 2018-04-18 11:27
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class LifecyleActivity extends AppCompatActivity {

    private  LifecyclePresenter  mLifecyclePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        Log.e("LifecyleActivity", "onCreate: ");

        mLifecyclePresenter=new LifecyclePresenter();
        getLifecycle().addObserver(mLifecyclePresenter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifecyleActivity", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifecyleActivity", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifecyleActivity", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifecyleActivity", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifecyleActivity", "onDestroy: ");
    }

    //页面跳转
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, LifecyleActivity.class);
        context.startActivity(intent);
    }
}
