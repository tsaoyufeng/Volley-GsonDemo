package com.tsao.volleytest;

import java.util.ArrayList;

public class Stories {
	private ArrayList<String> images;
	private int type;
	private int id;
	private String ga_prefix;
	private String title;
	
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGa_prefix() {
		return ga_prefix;
	}
	public void setGa_prefix(String ga_prefix) {
		this.ga_prefix = ga_prefix;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/*
	 * 		"type":0,
            "id":8382455,
            "ga_prefix":"060107",
            "title":"哺乳期妈妈吃什么，对宝宝的影响其实没那么大"*/
	// "DetailsList [distance=" + distance + ", nextLat=" + nextLat + ", nextLong=" + nextLong + ", nexti=" + nexti + ", status=" + status + "]";
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "stories [type=" + type + ", id=" + id + ",ga_prefix=" + ga_prefix +",title=" + title +"]";
	}*/

}
