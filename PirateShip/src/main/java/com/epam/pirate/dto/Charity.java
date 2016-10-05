package com.epam.pirate.dto;


import java.util.ArrayList;
import java.util.List;

import com.epam.pirate.model.CharityCategory;


public class Charity
{
    private long id;

    private String mail;

    private String name;

    private String description;

    private String contactPhone;

    private CharityCategory category;

    private String linkToOfficialPage;

    private List<CharityEvent> events = new ArrayList<>();

    private List<CharityGoal> goals = new ArrayList<>();

    private List<CharityPost> posts = new ArrayList<>();

    private String image;


    public Charity(com.epam.pirate.model.Charity charity)
    {
        id = charity.getId();
        mail = charity.getMail();
        name = charity.getName();
        description = charity.getDescription();
        contactPhone = charity.getContactPhone();
        setCategory(charity.getCategory());
        linkToOfficialPage = charity.getLinkToOfficialPage();

        for (com.epam.pirate.model.CharityEvent charityEvent : charity.getEvents())
        {
            events.add(new CharityEvent(charityEvent));
        }

        for (com.epam.pirate.model.CharityGoal charityGoal : charity.getGoals())
        {
            goals.add(new CharityGoal(charityGoal));
        }

        for (com.epam.pirate.model.CharityPost charityPost : charity.getPosts())
        {
            posts.add(new CharityPost(charityPost));
        }

        setImage(charity.getProfilePicture());

    }


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getContact()
    {
        return mail;
    }


    public void setContact(String mail)
    {
        this.mail = mail;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getContactPhone()
    {
        return contactPhone;
    }


    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }


    public String getHomepage()
    {
        return linkToOfficialPage;
    }


    public void setHomepage(String linkToOfficialPage)
    {
        this.linkToOfficialPage = linkToOfficialPage;
    }


    public List<CharityEvent> getEvents()
    {
        return events;
    }


    public void setEvents(List<CharityEvent> events)
    {
        this.events = events;
    }


    public List<CharityGoal> getGoals()
    {
        return goals;
    }


    public void setGoals(List<CharityGoal> goals)
    {
        this.goals = goals;
    }


    public List<CharityPost> getPosts()
    {
        return posts;
    }


    public void setPosts(List<CharityPost> posts)
    {
        this.posts = posts;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public CharityCategory getCategory()
    {
        return category;
    }


    public void setCategory(CharityCategory category)
    {
        this.category = category;
    }


    public String getImage()
    {
        return image;
    }


    public void setImage(String image)
    {
        this.image = image;
    }

}
