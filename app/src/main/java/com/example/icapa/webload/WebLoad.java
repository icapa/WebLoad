package com.example.icapa.webload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebLoad extends AppCompatActivity {
    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_load);
        wb = (WebView)findViewById(R.id.webView);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www.google.es");
    }
}
