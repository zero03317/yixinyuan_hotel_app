package com.tarena.android.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class p28 extends Activity {
	private GridView gv;
	private TextView textView;
	private String[] texts={"花蓮市美食推薦","壽豐鄉美食景點推薦","吉安美食景點","瑞穗美食景點","客房介紹","導航至逸心園","密碼修改","資訊內容訂閱","逸心園粉絲團"};
	private int[] images={R.drawable.ticket,R.drawable.order,R.drawable.branch,R.drawable.route,R.drawable.plane,R.drawable.memb,R.drawable.user,R.drawable.subscribe,R.drawable.help};
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p28);
        textView=(TextView)findViewById(R.id.textView2801);
        Intent intent=getIntent();
        String str=intent.getStringExtra("one");
        textView.setText(str);
        textView.setTextColor(Color.RED);
        
        
        gv=(GridView)findViewById(R.id.gridView1);
        
        List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
        
        for (int i = 0; i < 9; i++) {
        	Map<String,Object> map=new HashMap<String,Object>();
        	map.put("image", images[i]);
        	map.put("text", texts[i]);
        	data.add(map);
			
		}
        SimpleAdapter adpater=new SimpleAdapter(this,data,R.layout.grid_view_homepage,new String[]{"image","text"},new int[]{R.id.image_item,R.id.text_item});
        gv.setAdapter(adpater);
        
        gv.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
        			long arg3) {
        		// Ԥ����Ʊ�����ѯ
        		if(arg2==0){
        			Intent it=new Intent(p28.this,p05.class);
        	        startActivity(it);
        		}
        		
                // ����������?��ת��p12ҳ��
        		if(arg2==1){
        			Intent it1=new Intent(p28.this,p12.class);
        	        startActivity(it1);
        		}
        		
        		if(arg2==2){
        			Intent it2=new Intent(p28.this,p16.class);
        	        startActivity(it2);
        		}
        		
        		if(arg2==3){
        			Intent it3=new Intent(p28.this,p21.class);
        	        startActivity(it3);
        		}
        		
        		if(arg2==4){
        			Intent it4=new Intent(p28.this,p19.class);
        	        startActivity(it4);
        		}
        		
        		if(arg2==5){
        			Intent it5=new Intent(p28.this,p13.class);
        	        startActivity(it5);
        		}
        		
        		if(arg2==6){
        			Intent it6=new Intent(p28.this,p23.class);
        	        startActivity(it6);
        		}
        		
        		if(arg2==7){
        			Intent it7=new Intent(p28.this,p27.class);
        	        startActivity(it7);
        		}
        		if(arg2==8){
        			Intent it8=new Intent(p28.this,aboutus.class);
        	        startActivity(it8);
        		}
        		        		
        	}
		});
        
    }
}