package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebView = (WebView) findViewById(R.id.web);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://node-red-bcmxf.eu-gb.mybluemix.net/ui");
        mywebView.setWebViewClient(new WebViewClient());
    }

    //Code For Back Button
    @Override
    public void onBackPressed() {

        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }

        else
        {
            super.onBackPressed();
        }
    }
}

