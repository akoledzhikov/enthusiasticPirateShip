package com.epam.pirate.dto;


import java.util.Date;


public class UserContribution
{
    private long id;

    private String picture;

    private Date date;

    private double value;

    private String text;


    public UserContribution(com.epam.pirate.model.UserContribution contribution)
    {
        this.id = contribution.getId();
        this.picture = contribution.getType().getIconLocation();
        this.date = contribution.getDate();
        this.value = contribution.getValue();
        this.text = contribution.getText();
    }


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getPicture()
    {
        return picture;
    }


    public void setPicture(String picture)
    {
        this.picture = picture;
    }


    public double getValue()
    {
        return value;
    }


    public void setValue(double value)
    {
        this.value = value;
    }


    public String getText()
    {
        return text;
    }


    public void setText(String text)
    {
        this.text = text;
    }


    public Date getDate()
    {
        return date;
    }


    public void setDate(Date date)
    {
        this.date = date;
    }
}
