package com.tarena.android.activity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class p21 extends ListActivity 
{
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView(R.layout.flightline_inquire);
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
    private  String[] texts=new String[]{"富源廟口小吃","涂媽媽肉粽","綠精靈瑞穗鮮奶火鍋","舞鶴茶園","瑞穗牧場","六十石山"};//這邊要改，你有幾個選項改幾個
    //展示的圖片
    private int[] images=new int[]{R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house,R.drawable.house};//這邊也一樣，有幾個選項舊有幾個
    protected void onListItemClick(ListView l, View v, int position, long id) 
    {  
        //Toast.makeText(this, "雿��訾�"+texts[position], Toast.LENGTH_SHORT).show(); 
        if(position==0)
        {
        	Intent intent1 = new Intent(p21.this, food31.class);
			startActivity(intent1);	
        }else if(position==1)//ERRoR
        {
        	Intent intent1 = new Intent(p21.this, food32.class);
			startActivity(intent1);	
        }else if(position==2)
        {
        	Intent intent1 = new Intent(p21.this, food33.class);
			startActivity(intent1);	
        }else if(position==3)
    	{
        	Intent intent1 = new Intent(p21.this, place31.class);
			startActivity(intent1);	
        }
        else if(position==4)
        {
        	Intent intent1 = new Intent(p21.this, place32.class);
			startActivity(intent1);	
        }
        else if(position==5)
        {
        	Intent intent1 = new Intent(p21.this, place33.class);
			startActivity(intent1);	
        }
        /*else if(position==8)
        {
        	Intent intent1 = new Intent(MainActivity.this, place4.class);
			startActivity(intent1);	
        }
        else if(position==9)
        {
        	Intent intent1 = new Intent(MainActivity.this, place5.class);
			startActivity(intent1);	
        }
        /*else if(position==7)
        {
        	Intent intent1 = new Intent(MainActivity.this, service.class);
			stopService(intent1);
			File file = new File("/mnt/sdcard/Download/MyDatabases.db");
			file.delete();
			FileChannel fis = null;
			FileChannel fos = null;
			try{
				file.createNewFile();
				fis = new FileInputStream("/data/data/com.example.list/databases/MyDatabases.db").getChannel();
				fos = new FileOutputStream("/mnt/sdcard/Download/MyDatabases.db").getChannel();
				fos.transferFrom(fis,0,fis.size());
				if(fis !=null)fis.close();
				if(fos !=null)fos.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
        }*/
    }
    
}