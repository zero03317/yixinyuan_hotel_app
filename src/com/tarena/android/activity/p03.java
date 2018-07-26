/********************************************************************************************
 *                                                                                          *
 *                                                                                          *
 *                                                                                          *
 *                                                                                          *
 *                                                                                          *
 *                                                                                          *
 *                                                                                          *
 * /********************************************************************************************
 */
package com.tarena.android.activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.tarena.android.dbhelper.DBHelper;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.TextView;



public class p03 extends Activity {

    Button save;
    Button exit;
    DBHelper dbhelper;
    SQLiteDatabase db=null;
    Cursor cursor;
    Spinner sp;
    
    private EditText uid=null;
    private EditText upsw=null;
    private EditText urpsw=null;
    private EditText umail=null;
    private EditText uname=null;
    private EditText ucrednum=null;
    private ArrayAdapter<String> adapter;   
        
	private String id="";
	private String psw="";
	private String mail="";
	private String name="";
	private String crednumtype="";
	private String crednum="";

	private String ID="";
	
	private Spinner zjlxSp;
	
//	ArrayAdapter<String> adapter;
	

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p03);
  		zjlxSp=(Spinner)findViewById(R.id.p0306_sp);
  		List<String> zjlx=new ArrayList<String>();
  		zjlx.add("台灣身份證֤");
  		zjlx.add("護照");
  		zjlx.add("居留證");
  		ArrayAdapter<String> cbAdapter=new
  		ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,zjlx);
  		zjlxSp.setAdapter(cbAdapter);

		setTitle("註冊新會員");
        
        uid=(EditText)findViewById(R.id.p0301_et); 
        upsw=(EditText)findViewById(R.id.p0302_et);      
        urpsw=(EditText)findViewById(R.id.p0303_et);      
        umail=(EditText)findViewById(R.id.p0304_et);      
        uname=(EditText)findViewById(R.id.p0305_et);      
        ucrednum=(EditText)findViewById(R.id.p0307_et);      
     

        exit=(Button)findViewById(R.id.k0302);
        
        exit.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent intent2=new Intent(p03.this,p02.class);
	   				startActivity(intent2);
	   				finish();
				}
        });

        
        save=(Button)findViewById(R.id.k0301_btn);
        save.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			    switch(v.getId())
	              {
	              case R.id.k0301_btn:
	            	    Intent intent=getIntent();
						ID=String.valueOf(intent.getStringExtra("uid"));//��ȡID
						DBHelper dbhelper=new DBHelper(p03.this,"FLIGHTInfo", null, 1);
						SQLiteDatabase db=dbhelper.getReadableDatabase();
						String searchSql="select uid from userinfo where uid = "+ID;
						Cursor cursor=db.rawQuery(searchSql, null);
						db.execSQL(searchSql);
	            	  if(cursor.moveToNext()){
	            		  Toast.makeText(p03.this, "恭喜註冊成功", Toast.LENGTH_SHORT).show();
					    	db.close();
					    	break;
	            	  }
	            	  else  if(!(upsw.getText().toString().trim()).equals(urpsw.getText().toString().trim())){
							Toast.makeText(p03.this, "註冊失敗請重新註冊", Toast.LENGTH_SHORT).show();
							db.close();
							break;
						}
	            	  else{
								InsertData();
								break;
							}
	             }
			}
		});
  }
        
	 
/******************************
 * ���ȷ����д����ݿ�
 ******************************/
		    private void InsertData() {
				    	id=uid.getText().toString().trim();
				    	psw=upsw.getText().toString().trim();
				    	mail=umail.getText().toString().trim();
				    	name=uname.getText().toString().trim();
				    	crednum=ucrednum.getText().toString().trim();
				    	crednumtype=zjlxSp.getSelectedItem().toString().trim();
		    	
						
						dbhelper=new DBHelper(p03.this,"FLIGHTInfo",null,1);
						// TODO Auto-generated method stub
						String sqlString=
								" insert into userinfo (uid,psword,email,name,credentials,crednum) values (?,?,?,?,?,?)";
						
				        db=dbhelper.getWritableDatabase();
				        
						System.out.println(db);
				        SQLiteStatement stmt=db.compileStatement(sqlString);
						stmt.bindString(1, id);
						stmt.bindString(2, psw);
						stmt.bindString(3, mail);
						stmt.bindString(4, name);
						stmt.bindString(5, crednumtype);
						stmt.bindString(6, crednum);
				        db.beginTransaction();
						try {
							stmt.execute();
							db.setTransactionSuccessful();
						   
							 Toast.makeText(p03.this, "恭喜註冊成功！", Toast.LENGTH_SHORT).show();
							 
		
						} catch (Exception e) {
							// TODO Auto-generated catch block
							 e.printStackTrace();
							 Toast.makeText(p03.this, "註冊失敗！", Toast.LENGTH_LONG).show();
							 System.out.println("inserting failed");
						}finally{
							
							
								Intent intent2=new Intent(p03.this,p02.class);
			   					startActivity(intent2);						
						}
						
						db.endTransaction();
						db.close();
						dbhelper.close();
		}
		  
		    
}
























