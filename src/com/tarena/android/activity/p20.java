package com.tarena.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
/**
 *机型类型详情页面
 */
public class p20 extends Activity{
	private TextView flightType;
	private ImageView flightImage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flighttypedetail);
	}
}
