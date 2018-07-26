package com.tarena.android.activity;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class p13 extends Activity {  
   private static final String MAP_URL = "file:///android_asset/googleMap.html";
   private WebView webView;
   private EditText addressText;
   private Button submit;
   private boolean webviewReady = false; 
   @Override
   /** Called when the activity is first created. */
   public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.p13_layout); 
     addressText = (EditText) findViewById(R.id.addressText);  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
     submit = (Button) findViewById(R.id.submit);
     submit.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub             
             if (webviewReady) {                            
               //webView.loadUrl("javascript:resizeMap("+ (webView.getHeight()) + ")");
               webView.loadUrl("javascript:codeAddress('"+ addressText.getText() + "')");
               //Toast.makeText(v.getContext(), "javascript:codeAddress('"+ addressText.getText() + "')", Toast.LENGTH_LONG).show();
             }             
            }  
     });
   
     setupWebView();//設定webview        
   } 
    
   /** Sets up the WebView object and loads the URL of the page **/
   private void setupWebView(){
 
     webView = (WebView) findViewById(R.id.webview);
     webView.getSettings().setJavaScriptEnabled(true);
     //Wait for the page to load then send the location information
     webView.setWebViewClient(new WebViewClient(){ 
       @Override 
       public void onPageFinished(WebView view, String url) 
       {
         //webView.loadUrl(centerURL);
        webviewReady = true;//webview已經載入完畢
        webView.loadUrl("javascript:resizeMap("+ (webView.getHeight()) + ")");
       }

     });
     webView.loadUrl(MAP_URL);      
   }
}