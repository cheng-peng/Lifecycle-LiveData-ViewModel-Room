package com.cxp.livedata.custom;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.cxp.livedata.R;

/**
 * 文 件 名: MyLiveDataActivity
 * 创 建 人: CXP
 * 创建日期: 2018-04-18 19:44
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class MyLiveDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_live_data);

        MyObserver observer = new MyObserver();
        MyLiveData data = new MyLiveData();
        data.observe(this, observer);
    }

    private class MyObserver implements Observer<String> {

        //LiveData中的数据变化，通过postValue（可后台线程）或者setValue（主线程）设置后，将触发Observer的onChanged
        @Override
        public void onChanged(@Nullable String o) {
            Toast.makeText(MyLiveDataActivity.this,String.valueOf(o),Toast.LENGTH_SHORT).show();
        }
    }

    //页面跳转
    public static void startActivity(Context context){
        Intent intent=new Intent(context,MyLiveDataActivity.class);
        context.startActivity(intent);

    }
}
