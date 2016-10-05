package com.epam.pirate.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "Charities")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class Charity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String mail;

    private String password;

    private String name;

    @Column(length = 4096)
    private String description;

    private String contactPhone;

    private CharityCategory category;

    private String linkToOfficialPage;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "charity")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CharityEvent> events;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "charity")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CharityGoal> goals;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "charity")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CharityPost> posts;

    private String profilePicture;


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


    public String getPassword()
    {
        return password;
    }


    public void setPassword(String password)
    {
        this.password = password;
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


    public CharityCategory getCategory()
    {
        return category;
    }


    public void setCategory(CharityCategory category)
    {
        this.category = category;
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


    public String getProfilePicture()
    {
        return profilePicture;
    }


    public void setProfilePicture(String profilePicture)
    {
        this.profilePicture = profilePicture;
    }

}
