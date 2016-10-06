package com.epam.pirate.dto;




public class CharityPost
{
    private long id;

    private String title;
    private String text;

    private String datePosted;

    public CharityPost(com.epam.pirate.model.CharityPost post){
    	id = post.getId();
    	title = post.getTitle();
    	text = post.getText();
    	datePosted = DTOUtil.dateToPrettyString(post.getDatePosted());
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


    public String getContent()
    {
        return text;
    }


    public void setContent(String text)
    {
        this.text = text;
    }


    public String getDate()
    {
        return datePosted;
    }


    public void setDate(String datePosted)
    {
        this.datePosted = datePosted;
    }
}
