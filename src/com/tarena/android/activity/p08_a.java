package com.tarena.android.activity;

import java.util.ArrayList;
import java.util.List;

//import com.miao01all.android.Test01;
//import com.miao01all.android.Test02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class p08_a extends Activity{
	private Spinner cjrlxListSp,zjlxSp,zj;
	private Button btn;
  @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.p08_a);
	cjrlxListSp=(Spinner)findViewById(R.id.p0801_sp);
	zjlxSp=(Spinner)findViewById(R.id.p0803_sp);
	
	List<String> cjrlxList=new ArrayList<String>();
	cjrlxList.add("成年人");
	cjrlxList.add("儿童");
	cjrlxList.add("婴儿");
	ArrayAdapter<String> caAdapter=new
	ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cjrlxList);
	cjrlxListSp.setAdapter(caAdapter);
	
	List<String> zjlx=new ArrayList<String>();
	zjlx.add("身份证");
	zjlx.add("护照");
	zjlx.add("军官证");
	ArrayAdapter<String> cbAdapter=new
	ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,zjlx);
	zjlxSp.setAdapter(cbAdapter);
	
	//p08_a--->p18
	btn=(Button)findViewById(R.id.k0801);
    btn.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
			
//TODO Auto-generated method stub
		
Intent it=new Intent(p08_a.this,p18.class);
			startActivity(it);
	
	p08_a.this.finish();

	}
    });
}
}
