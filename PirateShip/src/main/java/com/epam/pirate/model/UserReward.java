package com.epam.pirate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "Rewards")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class UserReward
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;
    
    private String description;
    @Column(length=512)
    private String text;

    private String picture;

    private String awardedBy;


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public User getUser()
    {
        return user;
    }


    public void setUser(User user)
    {
        this.user = user;
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
