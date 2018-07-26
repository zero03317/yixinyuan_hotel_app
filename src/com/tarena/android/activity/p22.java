package com.tarena.android.activity;
import java.util.ArrayList;
import java.util.List;

import com.tarena.android.activity.R;
import com.tarena.android.dbhelper.DBHelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class p22 extends Activity{
	
	private Spinner zjlxSp;
	private EditText P22;
	private TextView TX1;
	private TextView TX2;
	private Button save;
	
	
	private String crednumtype="";
	private String crednum="1";
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p22_layout);

        setTitle("帳號密碼找回界面");
        
        P22=(EditText)findViewById(R.id.p22e03);
        TX1=(TextView)findViewById(R.id.tv22);
        TX2=(TextView)findViewById(R.id.tv22_1);
        

        
  		zjlxSp=(Spinner)findViewById(R.id.p22sp01);
  		List<String> zjlx=new ArrayList<String>();
  		zjlx.add("台灣身份證");
  		zjlx.add("護照");
  		zjlx.add("居留證");
  		ArrayAdapter<String> cbAdapter=new
  		ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,zjlx);
  		zjlxSp.setAdapter(cbAdapter);
        
        
  		save=(Button)findViewById(R.id.btn_p22);
        save.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        crednum=P22.getText().toString().trim();
		        crednumtype=zjlxSp.getSelectedItem().toString().trim();
		        
			    switch(v.getId())
	              {
	              case R.id.btn_p22:
						DBHelper dbhelper=new DBHelper(p22.this,"FLIGHTInfo", null, 1);
						SQLiteDatabase db=dbhelper.getReadableDatabase();
						String searchSql="select * from userinfo where credentials = '"+crednumtype+"' and crednum='"+crednum+"'";
						Cursor cursor=db.rawQuery(searchSql, null);
						if(cursor.moveToNext()){
	            		  	TX1.setText("您的賬號是"+cursor.getString(0));
	            		  	TX2.setText("您的密碼是"+cursor.getString(1));
					    	db.close();
					    	break;
	            	  }
	            	  else{
	            		  	Toast.makeText(p22.this, "您的證件號碼錯誤請重新輸入！", Toast.LENGTH_SHORT).show();
							break;
							}
	             }
			}
		});
    }

}
