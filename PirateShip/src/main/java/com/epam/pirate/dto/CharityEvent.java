package com.epam.pirate.dto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CharityEvent
{
    private long id;

    private String title;
    private String description;

    private Date startTime;

    private Date endTime;

    private String location;

    private List<CharityPost> posts;

    private ArrayList<String> pictures;

    public CharityEvent(com.epam.pirate.model.CharityEvent event){
    	id = event.getId();
    	title = event.getTitle();
    	description = event.getDescription();
    	startTime = event.getStartTime();
    	endTime = event.getEndTime();
    	location = event.getLocation();
    	pictures = event.getPictures();
    	
    	for (com.epam.pirate.model.CharityPost post : event.getPosts()) {
			posts.add(new CharityPost(post));
		}
    }

    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public Date getStartTime()
    {
        return startTime;
    }


    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }


    public Date getEndTime()
    {
        return endTime;
    }


    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }


    public String getLocation()
    {
        return location;
    }


    public void setLocation(String location)
    {
        this.location = location;
    }


    public List<CharityPost> getPosts()
    {
        return posts;
    }


    public void setPosts(List<CharityPost> posts)
    {
        this.posts = posts;
    }


    public ArrayList<String> getPictures()
    {
        return pictures;
    }


    public void setPictures(ArrayList<String> pictures)
    {
        this.pictures = pictures;
    }
}
