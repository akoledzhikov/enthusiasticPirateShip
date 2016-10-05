package com.epam.pirate.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    private User user;

    private Charity targetCharity;

    private String title;

    private String category;

    private String description;

    private List<String> pictures;

    private double price;


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


    public List<String> getPictures()
    {
        return pictures;
    }


    public void setPictures(List<String> pictures)
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
}
