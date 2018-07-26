package com.tarena.android.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
/**
 * 
 *���Ͳ�ѯҳ��
 *
 */
public class p19 extends Activity {
	private String[] type = {"逸心園二人房", "逸心園三人房", "逸心園四人房", "逸心園六人房"};
	private String[] carbin = {"浪漫庭院二人房        ", "溫馨庭院三人房        ", "夢幻陽台/精緻庭院四人房", "VIP庭院/豪華觀景六人房"};
	private int[] voyage = {1500, 1800, 2400, 3000};
	private String[] seats = {"1800", "2000", "2800", "3500"};
	
	private ListView lv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flighttypefind);
        
        lv = (ListView) this.findViewById(R.id.p19_lv);
        
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < type.length; i++) {
        	Map<String, Object> map = new HashMap<String, Object>();
        	map.put("tIndex", "房型:" + type[i]);
        	map.put("cIndex", carbin[i]);
        	map.put("vIndex", "平日價錢:" + voyage[i]);
        	map.put("sIndex", "假日價錢:"+seats[i]);
        	data.add(map);
        }
        
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.layout_19_1,	
        		new String[]{"tIndex", "cIndex", "vIndex", "sIndex"}, 
        		new int[]{R.id.p1901_tv, R.id.p1902_tv, R.id.p1903_tv, R.id.p1904_tv});
        
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
				Intent it=new Intent(p19.this,p20.class);
				startActivity(it);
				}
				if(arg2==1){
					Intent it1=new Intent(p19.this,p29.class);
				startActivity(it1);
				}
				if(arg2==2){
				Intent it2=new Intent(p19.this,p30.class);
				startActivity(it2);}
				if(arg2==3)
					{Intent it3=new Intent(p19.this,p31.class);
				startActivity(it3);}
				
			}});
        
        
        
    }
}