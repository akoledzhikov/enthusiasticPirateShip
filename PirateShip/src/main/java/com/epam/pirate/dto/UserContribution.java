package com.epam.pirate.dto;


import java.util.Date;

import com.epam.pirate.model.ContributionType;


public class UserContribution
{
    private long id;

    private ContributionType type;

    private Date date;

    private double value;

    private String text;

    public UserContribution(com.epam.pirate.model.UserContribution contribution){
    	this.id = contribution.getId();
    	this.type = contribution.getType();
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


    public ContributionType getType()
    {
        return type;
    }


    public void setType(ContributionType type)
    {
        this.type = type;
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
