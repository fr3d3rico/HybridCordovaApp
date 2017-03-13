package com.github.fr3d3rico.hybridcordovaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        WebView wb = new WebView(this);
//        wb.getSettings().setJavaScriptEnabled(true);
//        wb.loadUrl("file:///android_asset/www/index.html");
//        setContentView(wb);
    }

    public void startCordovaActivity(View view) {
        Intent intent = new Intent(this, CordovaViewTestActivity.class);
        startActivity(intent);
    }
}
