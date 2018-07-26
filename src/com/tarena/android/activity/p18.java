package com.tarena.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class p18 extends Activity{
	private ListView lv;
	private Button btn1,btn2,btn3;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p18_layout);
        
        btn3 = (Button)findViewById(R.id.p1803_btn);
        //点击“删除乘机人”按钮,删除成功回到“乘机人管理页（P18）”
        btn3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(p18.this,p18.class);
				startActivity(it);
			}
		});
    }

}
