package com.epam.pirate.dto;

public class UserReward
{
    private long id;

    private String title;
    private String text;

    private String picture;

    private String awardedBy;


    public UserReward(com.epam.pirate.model.UserReward reward){
    	id = reward.getId();
    	title = reward.getDescription();
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
        return text;
    }


    public void setDescription(String text)
    {
        this.text = text;
    }


    public String getImage()
    {
        return picture;
    }


    public void setImage(String picture)
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
