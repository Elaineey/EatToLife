package com.example.eattolife;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class CalorieChartActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_chart);
        imageButton1 = findViewById(R.id.Button_ba);
        imageButton2 = findViewById(R.id.Button_fo);
        imageButton3 = findViewById(R.id.Button_ex);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示包含ECharts的AlertDialog
                showEChartsDialog1();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示包含ECharts的AlertDialog
                showEChartsDialog2();
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示包含ECharts的AlertDialog
                showEChartsDialog3();
            }
        });
    }

    private void showEChartsDialog1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.activity_calorie_balance_dialog, null);
        WebView webView = dialogView.findViewById(R.id.chartshow_web);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("file:/Users/xiaoyixuan/AndroidStudioProjects/EatToLife2/app/src/main/assets/echarts_1.html");

        builder.setView(dialogView)
                .setPositiveButton("关闭", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showEChartsDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.activity_calorie_balance_dialog, null);
        WebView webView = dialogView.findViewById(R.id.chartshow_web);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("file:/Users/xiaoyixuan/AndroidStudioProjects/EatToLife2/app/src/main/assets/echarts_2.html");

        builder.setView(dialogView)
                .setPositiveButton("关闭", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showEChartsDialog3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.activity_calorie_balance_dialog, null);
        WebView webView = dialogView.findViewById(R.id.chartshow_web);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("file:/Users/xiaoyixuan/AndroidStudioProjects/EatToLife2/app/src/main/assets/echarts_2.html");

        builder.setView(dialogView)
                .setPositiveButton("关闭", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onClick(View v) {

    }
}