package com.cxp.lifecycle.test;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cxp.lifecycle.R;

/**
 * 文 件 名: TestActivity
 * 创 建 人: CXP
 * 创建日期: 2018-04-18 11:32
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TestActivity extends AppCompatActivity {

    private TestPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Log.e("TestActivity", "onCreate: ");

        mPresenter = new TestPresenter();
        mPresenter.onCreate();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TestActivity", "onStart: ");
        mPresenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TestActivity", "onResume: ");
        mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TestActivity", "onPause: ");
        mPresenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TestActivity", "onStop: ");
        mPresenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TestActivity", "onDestroy: ");
        mPresenter.onDestroy();
    }

    //页面跳转
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);
    }

}
