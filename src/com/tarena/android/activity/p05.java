package com.tarena.android.activity;

import com.tarena.android.activity.p05;
import com.tarena.android.activity.food1;
import com.tarena.android.activity.food2;
import com.tarena.android.activity.food3;
import com.tarena.android.activity.food4;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class p05 extends ListActivity 
{
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView(R.layout.find_fight);
        
        setListAdapter(new TextImageAdapter(this));  
    
    }  
    
    public static Context mContext;
    
   
    private class TextImageAdapter extends BaseAdapter
    {  
        //private Context mContext;  
        public TextImageAdapter(Context context) 
        {  
            mContext=context;  
        }  
           
        public int getCount() 
        {  
            return texts.length;  
        }  

        public Object getItem(int position) 
        {  
            return null;  
        }  
  
        public long getItemId(int position) 
        {  
            return 0;  
        }  
      
        public View getView(int position, View convertView, ViewGroup parent) 
        {  
             
            if(convertView==null)
            {  
                convertView=LayoutInflater.from(mContext).inflate((Integer) R.layout.item, null);  
                ItemViewCache viewCache=new ItemViewCache();  
                viewCache.mTextView=(TextView)convertView.findViewById(R.id.text);  
                viewCache.mImageView=(ImageView)convertView.findViewById(R.id.image);  
                convertView.setTag(viewCache);  
            }  
            ItemViewCache cache=(ItemViewCache)convertView.getTag();  
   
            cache.mTextView.setText(texts[position]);  
            cache.mImageView.setImageResource(images[position]);  
            return convertView;  
        }  
    }  
    
    private static class ItemViewCache
    {  
        public TextView mTextView;  
        public ImageView mImageView;  
    }  
    //展示的文字  
    private  String[] texts=new String[]{"戴記扁食","海埔蚵仔煎","公正包","炸彈蔥油餅","廟口紅茶","五霸包心粉圓","一心泡泡冰","鵝肉先生"};//這邊要改，你有幾個選項改幾個
    //展示的圖片
    private int[] images=new int[]{R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house};//這邊也一樣，有幾個選項舊有幾個
    protected void onListItemClick(ListView l, View v, int position, long id) 
    {  
        //Toast.makeText(this, "雿��訾�"+texts[position], Toast.LENGTH_SHORT).show(); 
        if(position==0)
        {
        	Intent intent1 = new Intent(p05.this, food1.class);
			startActivity(intent1);	
        }else if(position==1)//ERRoR
        {
        	Intent intent1 = new Intent(p05.this, food2.class);
			startActivity(intent1);	
        }else if(position==2)
        {
        	Intent intent1 = new Intent(p05.this, food3.class);
			startActivity(intent1);	
        }else if(position==3)
        {
        	Intent intent1 = new Intent(p05.this, food4.class);
			startActivity(intent1);	
        }else if(position==4)
        {
        	Intent intent1 = new Intent(p05.this, place1.class);
			startActivity(intent1);	
        }else if(position==5)
    	{
        	Intent intent1 = new Intent(p05.this, place2.class);
			startActivity(intent1);	
        }
        else if(position==6)
        {
        	Intent intent1 = new Intent(p05.this, place3.class);
        	startActivity(intent1);	
        }else if(position==7)
        {
        	Intent intent1 = new Intent(p05.this, place4.class);
        	startActivity(intent1);	}
    }
}


    
