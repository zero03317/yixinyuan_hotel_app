package com.tarena.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WelcomeActivity extends Activity{
	private ProgressBar progressBar;
	private TextView text;
	
	private Handler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		progressBar=(ProgressBar)findViewById(R.id.init_progress_bar);
		text=(TextView)findViewById(R.id.init_text);
		
		handler=new Handler(){

			@Override
			public void handleMessage(Message msg) {
				// TODO Auto-generated method stub
				super.handleMessage(msg);
				Bundle bun=msg.getData();
				String mesg_text=bun.getString("mesg_text");
				int mesg_progress=bun.getInt("mesg_progress");
				progressBar.setProgress(mesg_progress);
				text.setText(mesg_text);
			}
			
		};
		
		
		new Thread(){
			public void run(){
				init();
				//�������ȡ��ϣ���ת����¼����
				Intent it = new Intent(WelcomeActivity.this,p02.class);
				startActivity(it);
				WelcomeActivity.this.finish();
			}
		}.start();
		
	}
	
	private void init(){
		String[] mesgs={"正在初始化中.....","讀取中","進度35%","進度50%","進度70%","進度80%","登入中...."};
		int[] progress={10,25,35,50,70,85,100};
		
		Message mes0=new Message();
		Bundle bun0=new Bundle();
		bun0.putString("mesg_text", mesgs[0]);
		bun0.putInt("mesg_progress", progress[0]);
		mes0.setData(bun0);
		handler.sendMessage(mes0);
		
		step1();
		
		Message mes1=new Message();
		Bundle bun1=new Bundle();
		bun1.putString("mesg_text", mesgs[1]);
		bun1.putInt("mesg_progress", progress[1]);
		mes1.setData(bun1);
		handler.sendMessage(mes1);
		
		
		step2();
		
		Message mes2=new Message();
		Bundle bun2=new Bundle();
		bun2.putString("mesg_text", mesgs[2]);
		bun2.putInt("mesg_progress", progress[2]);
		mes2.setData(bun2);
		handler.sendMessage(mes2);
		
		step3();
		
		Message mes3=new Message();
		Bundle bun3=new Bundle();
		bun3.putString("mesg_text", mesgs[3]);
		bun3.putInt("mesg_progress", progress[3]);
		mes3.setData(bun3);
		handler.sendMessage(mes3);
		
		
		step4();
		
		Message mes4=new Message();
		Bundle bun4=new Bundle();
		bun4.putString("mesg_text", mesgs[4]);
		bun4.putInt("mesg_progress", progress[4]);
		mes4.setData(bun4);
		handler.sendMessage(mes4);
		
		step5();
		
		Message mes5=new Message();
		Bundle bun5=new Bundle();
		bun5.putString("mesg_text", mesgs[5]);
		bun5.putInt("mesg_progress", progress[5]);
		mes5.setData(bun5);
		handler.sendMessage(mes5);
		
		step6();
		
		Message mes6=new Message();
		Bundle bun6=new Bundle();
		bun6.putString("mesg_text", mesgs[6]);
		bun6.putInt("mesg_progress", progress[6]);
		mes6.setData(bun6);
		handler.sendMessage(mes6);
	}
	
	private void step1(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void step2(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void step3(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void step4(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void step5(){
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void step6(){
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
