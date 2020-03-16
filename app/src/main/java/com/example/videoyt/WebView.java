package com.example.videoyt;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebView extends AppCompatActivity {

    private android.webkit.WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://l.facebook.com/l.php?u=https%3A%2F%2Fwww.catholic.com%2F%3Ffbclid%3DIwAR27OOEHuvp6VP6P3Sxz9zI0UPrcehbB_gnYXhooBrmrmgNNzMjTofxblRo&h=AT0WsS9XmRkNJxVF4-AjmCOi8phPkZB_FIQAhNK0StUwt2TWVqQ6i4HGpvzc1tdLC2CVWpYvfX_5dfIbVWiGGyn4zOuQw014A70BWfkweYtlksuBBBJ0vruukOqQRqNdXfE");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {

        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
