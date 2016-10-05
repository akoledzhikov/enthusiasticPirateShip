package com.epam.pirate.dto;


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

    private List<CharityEvent> events;

    private List<CharityGoal> goals;

    private List<CharityPost> posts;

    public Charity(com.epam.pirate.model.Charity charity){
    	id = charity.getId();
    	mail = charity.getMail();
    	name = charity.getName();
    	description = charity.getDescription();
    	contactPhone = charity.getContactPhone();
    	category = charity.getCategory();
    	linkToOfficialPage = charity.getLinkToOfficialPage();
    	
    	for (com.epam.pirate.model.CharityEvent charityEvent : charity.getEvents()) {
			events.add(new CharityEvent(charityEvent));
		}
    	
    	for (com.epam.pirate.model.CharityGoal charityGoal : charity.getGoals()) {
			goals.add(new CharityGoal(charityGoal));
		}
    	
    	for (com.epam.pirate.model.CharityPost charityPost : charity.getPosts()) {
			posts.add(new CharityPost(charityPost));
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


    public String getMail()
    {
        return mail;
    }


    public void setMail(String mail)
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


    public String getLinkToOfficialPage()
    {
        return linkToOfficialPage;
    }


    public void setLinkToOfficialPage(String linkToOfficialPage)
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

}
