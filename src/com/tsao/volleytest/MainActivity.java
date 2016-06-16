package com.tsao.volleytest;


import java.lang.reflect.Type;
import java.util.ArrayList;

import org.json.JSONException;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	
	ArrayList<Stories> storiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //获取请求队列对象
        RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
        
        
        //创建请求对象，三个参数：
        //1.目标服务器的URL地址
        //2.服务器响应成功的回调
        //3.服务器响应失败的回调
        StringRequest stringRequest = new StringRequest("http://news-at.zhihu.com/api/4/news/latest",  
                new Response.Listener<String>() {  
                    @Override  
                    public void onResponse(String response) {  
                        //System.out.println(response);
                        try {
							parseDatas(response);
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    }  
                }, new Response.ErrorListener() {  
                    @Override  
                    public void onErrorResponse(VolleyError error) {  
                        Log.e("TAG", error.getMessage(), error);  
                    }  
                });
        /*StringRequest stringRequest = new StringRequest("http://192.168.182.1:8080/Chat/get_datas.json",  
                new Response.Listener<String>() {  
                    @Override  
                    public void onResponse(String response) {  
                        System.out.println(response);
                        try {
							parseData(response);
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    }  
                }, new Response.ErrorListener() {  
                    @Override  
                    public void onErrorResponse(VolleyError error) {  
                        Log.e("TAG", error.getMessage(), error);  
                    }  
                });*/
        
        
        //将请求对象加入请求队列
        mQueue.add(stringRequest);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /*private void parseData(String data)throws JSONException{
    	Gson gson = new Gson();
    	Type listType = new TypeToken<ArrayList<Person>>(){}.getType();
    	ArrayList<Person> result = gson.fromJson(data, listType);
    	
    	for(Person person : result){
    		System.out.println("id:" + person.getId());
    		System.out.println("version:" + person.getVersion());
    		System.out.println("name:" + person.getName());
    	}
    }*/
    
    private void parseDatas(String data)throws JSONException{
    	Gson gson = new Gson();
    	Zhihu zhihu = gson.fromJson(data, Zhihu.class);

    	ArrayList<Stories> storiesList = zhihu.getStories();
 	
    	for(Stories stories : storiesList){
    		ArrayList<String> imagesList = stories.getImages();
    		for(String imagesurl : imagesList){
    			System.out.println(imagesurl);
    		}
    		System.out.println("type:" + stories.getType());
    		System.out.println("id:" + stories.getId());
    		System.out.println("ga_prefix:" + stories.getGa_prefix());
    		System.out.println("title:" + stories.getTitle());
    		System.out.println("--------------------------------------");
    	}
    }
    
    
}
