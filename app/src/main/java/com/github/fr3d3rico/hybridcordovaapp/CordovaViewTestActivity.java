package com.github.fr3d3rico.hybridcordovaapp;

import android.os.Bundle;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.engine.SystemWebView;

public class CordovaViewTestActivity extends CordovaActivity {

    SystemWebView cordovaWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        cordovaWebView = (SystemWebView) findViewById(R.id.tutorialView);
        Config.init(this);
        cordovaWebView.loadUrl(Config.getStartUrl());
    }

}
