package com.cxp.lifecycle.test;

import android.util.Log;

/**
 * 文 件 名: TestPresenter
 * 创 建 人: CXP
 * 创建日期: 2018-04-18 11:23
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TestPresenter implements TestIPresenter {

    @Override
    public void onCreate() {
        Log.e("TestPresenter", "onCreate: ");
    }

    @Override
    public void onStart() {
        Log.e("TestPresenter", "onStart: ");
    }

    @Override
    public void onResume() {
        Log.e("TestPresenter", "onResume: ");
    }

    @Override
    public void onPause() {
        Log.e("TestPresenter", "onPause: ");
    }

    @Override
    public void onStop() {
        Log.e("TestPresenter", "onStop: ");
    }

    @Override
    public void onDestroy() {
        Log.e("TestPresenter", "onDestroy: ");
    }
}
