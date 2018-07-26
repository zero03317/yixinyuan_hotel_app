package com.tarena.android.dbhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
	public final static String DB_NAME="FLIGHTInfo";
	public final static int VERSION=1;
	public DBHelper instance=null;
	
	public static final String TB_NAME1 = "userinfo";   
    public static final String UID = "uid";   
    public static final String UPASSWORD= "psword";
    public static final String UEMAIL = "email";
    public static final String UNAME = "name";
    public static final String UCRED = "credentials"; 
    public static final String UUCREDNUM="crednum";
      
	public static final String contacts_id="uid";
	public static final String contacts_psword="psword";
	public static final String contacts_mail="email";
	public static final String contacts_name="name";
	public static final String contacts_cred="credentials";
	public static final String contacts_crednum="crednum";



	String contactProjection[]={
				contacts_id,
				contacts_psword,
				contacts_mail,
				contacts_name,
				contacts_cred,
				contacts_crednum,
			}; 
	
	//table groups
	public static final String groups_id="_id";
	public static final String groups_groupName="groupName";

    
//    private static SQLiteDatabase MySQLiteDB=null;
    
    
//    
	
	public DBHelper(Context context, String name,CursorFactory factory, int VERSION) {
//		创建数据库  DB_NAME是数据库的名称
		super(context, DB_NAME, null, VERSION);
		
	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		 //TODO Auto-generated method stub
		String TB_INFO="CREATE TABLE IF NOT EXISTS "    
            + TB_NAME1 + " ("
            + UID + " PRIMARY KEY , "
            + UPASSWORD  + " TEXT, "
            + UEMAIL   + " TEXT, "
            + UNAME    + " TEXT, "
            + UCRED   + " TEXT,"
            + UUCREDNUM   + " varchar(30));"; 
		
		db.execSQL(TB_INFO);
		
}

	
	

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
        onCreate(db);
		System.out.println("onUpgrade");
	}
	

}