package com.tarena.android.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
/**
 * 修改乘机人页面
 */
public class p08_b extends Activity{
	private Spinner typeSp,certificateSp;
	private Button alterBtn;
	private ArrayList<String> types,certificates;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_passenger);
		createTypes();
		createCertificates();
		
		typeSp=(Spinner)findViewById(R.id.p08_b01_sp);
		certificateSp=(Spinner)findViewById(R.id.p08_b02_sp);
		alterBtn=(Button)findViewById(R.id.k0802);
		
		ArrayAdapter<String> typeAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,types);
		typeSp.setAdapter(typeAdapter);
		ArrayAdapter<String> certificateAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,certificates);
		certificateSp.setAdapter(certificateAdapter);
		
		alterBtn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent it=new Intent(p08_b.this,p18.class);
				startActivity(it);
				
			}
		});
		
		
	}
	
	private void createTypes(){
		types=new ArrayList<String>();
		types.add("成人");
		types.add("儿童");
		types.add("婴儿");
		
	}
	private void createCertificates(){
		certificates=new ArrayList<String>();
		certificates.add("身份证");
		certificates.add("护照");
		certificates.add("军官证");
		
	}
}
