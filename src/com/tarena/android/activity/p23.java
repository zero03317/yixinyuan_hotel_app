package com.tarena.android.activity;

import com.tarena.android.dbhelper.DBHelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class p23 extends Activity{
	

	private Button k2301_btn;
	private EditText p2301_et;
	private EditText p2302_et;
	private EditText p2303_et;
	private EditText p2304_et;
	private String ID="";
	private Cursor cursor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_password_manager);
		k2301_btn=(Button)findViewById(R.id.k2301_btn);
		p2301_et=(EditText)findViewById(R.id.p2301_et);
		p2302_et=(EditText)findViewById(R.id.p2302_et);
		p2303_et=(EditText)findViewById(R.id.p2303_et);
		p2304_et=(EditText)findViewById(R.id.p2304_et);
		
		Intent intent=getIntent();		
		ID = String.valueOf(intent.getStringExtra("_id"));//��ȡID
		if(intent.getExtras()!=null)//�޸�
		{

			p2301_et.setText(ID);
			DBHelper dbhelper=new DBHelper(p23.this,"FLIGHTInfo", null, 1);
			SQLiteDatabase db=dbhelper.getReadableDatabase();
			String searchSql="select * from userinfo where uid = '"+ID+"'";
			cursor=db.rawQuery(searchSql, null);

				if(cursor.moveToNext())
				{//�����
					k2301_btn.setOnClickListener(new OnClickListener() {
						public void onClick(View arg0) {

							if(p2302_et.getText().toString().trim().equals(cursor.getString(1)))
							{	
								if(p2303_et.getText().toString().trim().equals(p2304_et.getText().toString().trim())){
									String searchSql2="update userinfo set psword = '"
												+p2303_et.getText().toString().trim()
												+"' where uid='"+p2301_et.getText().toString().trim()+"'";
									DBHelper dbhelper=new DBHelper(p23.this,"FLIGHTInfo", null, 1);
									SQLiteDatabase db=dbhelper.getReadableDatabase();
									db.execSQL(searchSql2);
									Toast.makeText(p23.this, "密碼修改成功", Toast.LENGTH_SHORT).show();
									Intent intent2=new Intent(p23.this,p04.class);
									startActivity(intent2);
									db.close();
									cursor.close();
									finish();
	
									 
								}
								else
									Toast.makeText(p23.this, "密碼修改失敗！", Toast.LENGTH_SHORT).show();
									
							}	
							else
							{
								Toast.makeText(p23.this, "密碼更改失敗！請確認是否有輸入錯誤！", Toast.LENGTH_SHORT).show();
							}

						}

					

					});
				}
		}


	}
}

