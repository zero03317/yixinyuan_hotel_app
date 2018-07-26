package com.tarena.android.activity;

import com.tarena.android.activity.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus  extends Activity {
	 
	 WebView mWebView = null;
	  
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.aboutus);
	   
	  mWebView = (WebView)findViewById(R.id.webview);
	   
	  mWebView.setWebViewClient(mWebViewClient);
	  mWebView.loadUrl("https://www.facebook.com/YishinGardenFans?fref=ts");
	 }
	  
	  
	 WebViewClient mWebViewClient = new WebViewClient() {
	  @Override
	  public boolean shouldOverrideUrlLoading(WebView view, String url) {
	   view.loadUrl(url);
	   return true;
	  }
	 };
	}
