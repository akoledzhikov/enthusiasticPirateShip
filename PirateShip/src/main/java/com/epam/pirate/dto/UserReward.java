package com.epam.pirate.dto;

public class UserReward
{
    private long id;

    private String description;
    private String text;

    private String picture;

    private String awardedBy;


    public UserReward(com.epam.pirate.model.UserReward reward){
    	id = reward.getId();
    	description = reward.getDescription();
    	text = reward.getText();
    	picture = reward.getPicture();
    	awardedBy = reward.getAwardedBy();
    }
    
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getText()
    {
        return text;
    }


    public void setText(String text)
    {
        this.text = text;
    }


    public String getPicture()
    {
        return picture;
    }


    public void setPicture(String picture)
    {
        this.picture = picture;
    }


    public String getAwardedBy()
    {
        return awardedBy;
    }


    public void setAwardedBy(String awardedBy)
    {
        this.awardedBy = awardedBy;
    }

}
