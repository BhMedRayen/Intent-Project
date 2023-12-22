package com.mohamedrayen.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val myWebView = findViewById<WebView>(R.id.webView)
        myWebView.loadUrl("https://facebook.com")
        myWebView.settings.javaScriptEnabled=true
        myWebView.settings.setSupportZoom(true)

    }
}