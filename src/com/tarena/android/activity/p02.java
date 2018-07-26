package com.tarena.android.activity;

import com.tarena.android.dbhelper.DBHelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;







public class p02 extends Activity {
	private Button but, but1,but2,but3;
	
	
	DBHelper dbhelper=null;
	SQLiteDatabase db=null;
	String sqlString="";
    public final static String DB_NAME="MyAssistant";
	public final static int VERSION=1;
    public static final String TB_NAME = "assistantlist"; 
    Cursor cursor;
	private Intent intent;
	
	
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p02_view);

		but = (Button) findViewById(R.id.k0201);
		but.setOnClickListener(new OnClickListener() {
			// ��ת����ҳ��
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText et1=(EditText)findViewById(R.id.e0201);
				EditText et2=(EditText)findViewById(R.id.e0202);
				DBHelper dbhelper=new DBHelper(p02.this,"FLIGHTInfo", null, 1);
				SQLiteDatabase db=dbhelper.getReadableDatabase();
				String searchSql="select uid,psword from userinfo where uid = '"+et1.getText().toString().trim()+"'";
				Cursor cursor=db.rawQuery(searchSql, null);
				
				
				if(cursor.moveToNext()){ 
					if(et1.getText().toString().trim().equals(cursor.getString(0)))
					{
						if(et2.getText().toString().trim().equals(cursor.getString(1))){
							Intent it = new Intent(p02.this, p04.class);					        
							it.putExtra("_id", cursor.getString(0));		
							startActivity(it);
							db.close();
							finish();
				    	}
						else{
		            		  Toast.makeText(p02.this, "帳號或者密碼錯誤！請重新再試！", Toast.LENGTH_SHORT).show();
		            		  db.close();
						}
				   }

				
					else{
	            		  Toast.makeText(p02.this, "帳號或者密碼錯誤！請重新再試！", Toast.LENGTH_SHORT).show();
	            		  db.close();
	            	}

            	}
				else if("".equals(et1.getText().toString().trim())){
					Toast.makeText(p02.this, "帳號或者密碼錯誤！請重新再試！", Toast.LENGTH_SHORT).show();
					db.close();
					}
				else if("".equals(et2.getText().toString().trim())){
					Toast.makeText(p02.this, "帳號或者密碼錯誤！請重新再試！", Toast.LENGTH_SHORT).show();
					db.close();
					}
				

			}
		});

		but1 = (Button) findViewById(R.id.k0202);
		but1.setOnClickListener(new OnClickListener() {
			// ��ת��ע��ҳ��
			public void onClick(View arg0) {
				// TODO Auto-generated method stub  		
    			
				Intent it = new Intent(p02.this, p03.class);
				startActivity(it);

			}
		});
		
		but2 = (Button) findViewById(R.id.k0204);
		but2.setOnClickListener(new OnClickListener() {
			// ��ת��ע��ҳ��
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				p02.this.finish();
			}
		});
		
		but3 = (Button) findViewById(R.id.k0203);
		but3.setOnClickListener(new OnClickListener() {
			// �һ�����
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
    			
				Intent it = new Intent(p02.this, p22.class);
				startActivity(it);

			}
		});

	}
}