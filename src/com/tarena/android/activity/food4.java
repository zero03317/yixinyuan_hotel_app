package com.tarena.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class food4 extends Activity {
    private Button button01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food4);
        //button01 = (Button)findViewById(R.id.button1);
        //Intent intent = getIntent();
        //Bundle bundle = intent.getExtras();
        //String day = bundle.getString("food");
        //setTitle(day);
        /*button01.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent();
                i.setClass(food4.this,MainActivity.class);
                startActivity(i);
            }
        });*/

    }

}

