package com.hmj.shuwenouwan.commonutillibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hmj.shuwenouwan.commonutil.AppPhoneMgr;
import com.hmj.shuwenouwan.commonutil.AppScreenMgr;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int getPhoneStatus = AppScreenMgr.getStatusBarHeight(this);
        Log.d("调试", getPhoneStatus+"");
    }
}
