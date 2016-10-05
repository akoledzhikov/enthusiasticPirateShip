package com.epam.pirate.model;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "Offers")
@GeneratePojoBuilder(withSetterNamePattern="*")
public class Offer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Charity targetCharity;

    private String title;

    private String category;
    @Column(length=4096)
    private String description;

    @Lob
    private ArrayList<String> pictures;

    private double price;
    
    private boolean active;


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


    public Charity getTargetCharity()
    {
        return targetCharity;
    }


    public void setTargetCharity(Charity targetCharity)
    {
        this.targetCharity = targetCharity;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }


    public String getCategory()
    {
        return category;
    }


    public void setCategory(String category)
    {
        this.category = category;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public ArrayList<String> getPictures()
    {
        return pictures;
    }


    public void setPictures(ArrayList<String> pictures)
    {
        this.pictures = pictures;
    }


    public double getPrice()
    {
        return price;
    }


    public void setPrice(double price)
    {
        this.price = price;
    }


    public boolean isActive()
    {
        return active;
    }


    public void setActive(boolean active)
    {
        this.active = active;
    }
}
