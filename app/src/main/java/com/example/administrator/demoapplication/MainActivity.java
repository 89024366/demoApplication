package com.example.administrator.demoapplication;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Map<String, Object>> wordslist;
    private SimpleAdapter simpleAdapter;
    private String[] names = new String[]{"LifeCycle", "UserName", "UserNmae_Final","Layout","Layout_final","button","buttontoast",
            "button_startActivity","button_startActivity_extra","imageButton","edittext","radiobutton","listview","getcolor","gradientbackgroud",
    "intentcaller","weather","weatherApplication","listview_demo","listview_adpter","audiorecorder","database","fragmentone","webview",
    "servicedemo","service","fingerprint","appPrivateDirectory","assetsFolder","interpassdata"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.m_lv);
        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("name", names[i]);
            showitem.put("index",i);
            listitem.add(showitem);
        }
//android:exported="true"
        simpleAdapter = new SimpleAdapter(this,listitem,
                R.layout.item,
                new String[]{"name"},
                new int[]{R.id.tv});
        listView.setAdapter(simpleAdapter);

        int i=0;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* HashMap<String, String> map = (HashMap<String, String>) parent.getItemAtPosition(position);
                String  str = map.get("index");
                int index=Integer.parseInt(str);*/
                Intent in = new Intent();
               switch (position){
                   case 0:
                       in.setClass(MainActivity.this, mg.studio.activitylifecycle.MainActivity.class);
                       break;
                   case 1:
                       in.setClass(MainActivity.this, mg.studio.username.MainActivity.class);
                       break;
                   case 2:
                       in.setClass(MainActivity.this, mg.studio.usernamefinal.MainActivity.class);
                       break;
                   case 3:
                       in.setClass(MainActivity.this, com.example.layouts.MainActivity.class);
                       break;
                   case 4:
                       in.setClass(MainActivity.this, mg.studio.layouts.MainActivity.class);
                       break;
                   case 5:
                       in.setClass(MainActivity.this, mg.studio.button.MainActivity.class);
                       break;
                   case 6:
                       in.setClass(MainActivity.this, mg.studio.buttontoast.MainActivity.class);
                       break;
                   case 7:
                       in.setClass(MainActivity.this, cn.edu.cqu.buttontoast.MainActivity.class);
                       break;
                   case 8:
                       in.setClass(MainActivity.this, cn.edu.cqu.buttontoastt.MainActivity.class);
                       break;
                   case 9:
                       in.setClass(MainActivity.this, com.example.imagebutton.MainActivity.class);
                       break;
                   case 10:
                       in.setClass(MainActivity.this, com.example.edittext.MainActivity.class);
                       break;
                   case 11:
                       in.setClass(MainActivity.this, com.example.radiobuttonsclick.MainActivity.class);
                       break;
                   case 12:
                       in.setClass(MainActivity.this, com.example.listView.MainActivity.class);
                       break;
                   case 13:
                       in.setClass(MainActivity.this, cn.edu.cqu.getcolor.MainActivity.class);
                       break;
                   case 14:
                       in.setClass(MainActivity.this, mg.studio.gradientbackground.MainActivity.class);
                       break;
                   case 15:
                       in.setClass(MainActivity.this, mg.studio.intentcaller.MainActivity.class);
                       break;
                   case 16:
                       in.setClass(MainActivity.this, mg.studio.weather.MainActivity.class);
                       break;
                   case 17:
                       in.setClass(MainActivity.this, mg.studio.weatherappdesign.MainActivity.class);
                       break;
                   case 18:
                       in.setClass(MainActivity.this, mg.studio.listview_demo.MainActivity.class);
                       break;
                   case 19:
                       in.setClass(MainActivity.this, mg.studio.listviewcustomadapter.MainActivity.class);
                       break;
                   case 20:
                       in.setClass(MainActivity.this, mg.studio.audiorecorder.MainActivity.class);
                       break;
                   case 21:
                       in.setClass(MainActivity.this, mg.studio.database.MainActivity.class);
                       break;
                   case 22:
                       in.setClass(MainActivity.this, mg.studio.fragmentdemo001.MainActivity.class);
                       break;
                   case 23:
                       in.setClass(MainActivity.this, mg.studio.prototyping.MainActivity.class);
                       break;
                   case 24:
                       in.setClass(MainActivity.this, mg.studio.servicedemo.MainActivity.class);
                       break;
                   case 25:
                       in.setClass(MainActivity.this, mg.studio.service.MainActivity.class);
                       break;
                   case 26:
                       in.setClass(MainActivity.this, mg.studio.fingerprint.MainActivity.class);
                       break;
                   case 27:
                       in.setClass(MainActivity.this, mg.studio.writefileexternalstorage.MainActivity.class);
                       break;
                   case 28:
                       in.setClass(MainActivity.this, mg.studio.assetsfolder.MainActivity.class);
                       break;
                   case 29:
                       in.setClass(MainActivity.this, mg.studio.intentpassdata.MainActivity.class);
                       break;


               }
                if(in !=null) {
                    startActivity(in); //启动app B
                }

        };
        });
    }

}

