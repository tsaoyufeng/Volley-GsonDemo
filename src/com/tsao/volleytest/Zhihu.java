package com.tsao.volleytest;

import java.util.ArrayList;

public class Zhihu {
	
	private String date;
	private ArrayList<Stories> stories;
	private ArrayList<TopStories> top_stories;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<Stories> getStories() {
		return stories;
	}
	public void setStories(ArrayList<Stories> stories) {
		this.stories = stories;
	}
	public ArrayList<TopStories> getTop_stories() {
		return top_stories;
	}
	public void setTop_stories(ArrayList<TopStories> top_stories) {
		this.top_stories = top_stories;
	}
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		//"QueryResultInfo [status=" + status + ", msg=" + msg + ", data=" + data.toString() + "]"
		return "Zhihu [ date=" + date + ",stories=" + stories.toString() + ",top_sotries=" + top_stories.toString() + "]";
	}*/

}
