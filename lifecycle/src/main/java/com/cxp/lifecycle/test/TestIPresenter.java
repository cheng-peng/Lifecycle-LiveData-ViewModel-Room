package com.cxp.lifecycle.test;

/**
 * 文 件 名: TestIPresenter
 * 创 建 人: CXP
 * 创建日期: 2018-04-18 11:22
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface TestIPresenter {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();
}
