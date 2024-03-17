package com.example.eattolife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Switch;


public class CalorieBalanceDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_balance_dialog);
        init();
        SleepThread();
    }

    private WebView webview;

    private void init() {
        webview = findViewById(R.id.chartshow_web);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.loadUrl("file:/Users/xiaoyixuan/AndroidStudioProjects/EatToLife2/app/src/main/assets/echarts_2.html");
    }

    private void SleepThread(){
        /**
         * 原文作者提到：js方法的调用必须在html页面加载完成之后才能调用。
         *     用webview加载html还是需要耗时间的，必须等待加载完，在执行代用js方法的代码。
         * 我个人还想提醒:检查html和js是否都放在asset目录下
         */
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}


