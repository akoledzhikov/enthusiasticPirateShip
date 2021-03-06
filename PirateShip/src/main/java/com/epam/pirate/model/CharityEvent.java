package com.epam.pirate.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "CharityEvents")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class CharityEvent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch=FetchType.EAGER)
    private Charity charity;

    private String title;
    @Column(length=10000)
    private String description;

    private Date startTime;

    private Date endTime;

    private String location;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="event")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CharityPost> posts;

    @Lob
    private ArrayList<String> pictures;


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public Charity getCharity()
    {
        return charity;
    }


    public void setCharity(Charity charity)
    {
        this.charity = charity;
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
