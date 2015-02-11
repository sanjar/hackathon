package com.mbrdi.helpinghand;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings.PluginState;

public class StartActivity extends Activity {

	WebView webView ;
	@SuppressLint({ "SetJavaScriptEnabled", "NewApi" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		webView = (WebView) findViewById(R.id.webView1);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		settings.setPluginState(PluginState.ON);
		//settings.setDisplayZoomControls(true);
		settings.setBuiltInZoomControls(true);
		//settings.setUseWideViewPort(true);
		
		webView.setVerticalScrollBarEnabled(true);
		webView.setHorizontalScrollBarEnabled(true);
		webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
		webView.loadUrl("http://10.0.2.2:8080/HelpingHand/home");
		webView.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				if(url.contains("generateReceipt")){
					url = "https://docs.google.com/gview?embedded=true&url="+url;
				}
				view.loadUrl(url);
				Log.d(StartActivity.class.getName(), url);
				System.out.println(url);
				return false;
			}
			/*@Override
			public void onPageFinished(WebView view, String url) {
				// TODO Auto-generated method stub
			
				
			}*/
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_BACK && webView.canGoBack()){
			webView.goBack();
			return true;
		}
		else{
			finish();
		}
		return super.onKeyDown(keyCode, event);
	}
}
