package com.epam.pirate.dto;


import java.util.ArrayList;
import java.util.List;


public class CharityEvent
{
    private long id;

    private String title;
    private String description;

    private String startTime;

    private String endTime;

    private String location;

    private List<CharityPost> posts = new ArrayList<>();

    private ArrayList<String> pictures = new ArrayList<>();

    private long owner;


    public CharityEvent(com.epam.pirate.model.CharityEvent event)
    {
        id = event.getId();
        title = event.getTitle();
        description = event.getDescription();
        startTime = DTOUtil.dateToPrettyString(event.getStartTime());
        endTime = DTOUtil.dateToPrettyString(event.getEndTime());
        location = event.getLocation();
        pictures = event.getPictures();
        owner = event.getCharity().getId();

        for (com.epam.pirate.model.CharityPost post : event.getPosts())
        {
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


    public String getStartTime()
    {
        return startTime;
    }


    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }


    public String getEndTime()
    {
        return endTime;
    }


    public void setEndTime(String endTime)
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


    public ArrayList<String> getImages()
    {
        return pictures;
    }


    public void setImages(ArrayList<String> pictures)
    {
        this.pictures = pictures;
    }


    public long getOwner()
    {
        return owner;
    }


    public void setOwner(long owner)
    {
        this.owner = owner;
    }

}
