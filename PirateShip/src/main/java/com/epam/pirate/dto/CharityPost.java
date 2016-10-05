package com.epam.pirate.dto;


import java.util.Date;


public class CharityPost
{
    private long id;

    private String title;
    private String text;

    private Date datePosted;

    public CharityPost(com.epam.pirate.model.CharityPost post){
    	id = post.getId();
    	title = post.getTitle();
    	text = post.getText();
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


    public String getText()
    {
        return text;
    }


    public void setText(String text)
    {
        this.text = text;
    }


    public Date getDatePosted()
    {
        return datePosted;
    }


    public void setDatePosted(Date datePosted)
    {
        this.datePosted = datePosted;
    }
}
