package com.epam.pirate.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "CharityPosts")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class CharityPost
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Charity charity;
    @ManyToOne(fetch = FetchType.EAGER)
    private CharityEvent event;

    private String title;

    private String text;

    private Date datePosted;


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


    public CharityEvent getEvent()
    {
        return event;
    }


    public void setEvent(CharityEvent event)
    {
        this.event = event;
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
