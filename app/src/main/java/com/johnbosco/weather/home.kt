package com.johnbosco.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class home : AppCompatActivity() {
    private val webView: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Giving a tittle
        title = "weather forecast"
        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
        //webViewclient is the object responsible for most the actions inside
        val webSettings = webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://www.unma.go.ug/")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
            //conGoBack()
            //this method specifies the WebView has a back history item.
        } else {
            super.onBackPressed()
        }
    }
}