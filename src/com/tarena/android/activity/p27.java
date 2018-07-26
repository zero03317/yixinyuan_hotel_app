package com.tarena.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class p27 extends Activity{
	private CheckBox cb1,cb2,cb3,cb4;
	private Button btn1,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dingyue);
		
		cb1 = (CheckBox)findViewById(R.id.p2701_cb);
		cb2 = (CheckBox)findViewById(R.id.p2702_cb);
		cb3 = (CheckBox)findViewById(R.id.p2703_cb);
		cb4 = (CheckBox)findViewById(R.id.p2704_cb);
		btn1 = (Button)findViewById(R.id.p2705_btn);
		btn2 = (Button)findViewById(R.id.p2706_btn);
		
		btn2.setOnClickListener(new OnClickListener() {
			// ��ת��ע��ҳ��
			public void onClick(View arg0) {
				// TODO Auto-generated method stub  		
    			
				Intent it = new Intent(p27.this, p04.class);
				startActivity(it);

			}
		});
		btn1.setOnClickListener(new OnClickListener() {
			// ��ת��ע��ҳ��
			public void onClick(View arg0) {
				// TODO Auto-generated method stub  	
				String s="";
				if(cb1.isChecked())
					s+="凡是在2013/12/20至2014/1/1訂購房間享有9折優惠！快來哦～fb搜尋逸心園      ";
				if(cb2.isChecked())
					s+="來到花蓮一定要去的景點推薦  1.鯉魚譚 2.立川漁場 3.夢幻湖 4.南濱夜市 5.七星潭 6.太魯閣國家公園 7.慕谷慕魚 ";
				if(cb3.isChecked())
					s+="1.海洋公園(全票NT890 , 優惠票NT790, 博愛票NT590)  2. 花蓮賞鯨費用(含接送)： 現場報名800/人 預約報名700/大人,500/6-12歲兒童,300/3歲以下。 ";
				if(cb4.isChecked())
					s+="12/18 白天:陰短暫雨16～22度  晚上:多雲短暫雨 15～18度    *出門前請攜帶雨具* ";
				new AlertDialog.Builder(p27.this)
				.setTitle("提示")
				.setMessage("感謝訂閱")
				.setPositiveButton(R.string.ok_str, new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int p2705_btn) {
						// TODO Auto-generated method stub
						
					}
				}).show();
				Intent intent = new Intent();	    //Intent���ݲ���
	            intent.putExtra("one", s);
	            intent.setClass(p27.this, p28.class);
				startActivity(intent);
				finish();

			}
		});
	}
}
