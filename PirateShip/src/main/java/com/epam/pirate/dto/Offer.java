package com.epam.pirate.dto;


import java.util.ArrayList;


public class Offer
{
    private long id;

    private String title;

    private String category;
    private String description;

    private ArrayList<String> pictures = new ArrayList<>();
    
    private String firstImage;

    private double price;
    
	public Offer(com.epam.pirate.model.Offer offer){
    	id = offer.getId();
    	title = offer.getTitle();
    	category = offer.getCategory();
    	description = offer.getDescription();
    	pictures = offer.getPictures();
    	price = offer.getPrice();
    	setFirstImage(pictures.isEmpty() ? null : pictures.get(0));
    }
    
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
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

    public String getFirstImage()
    {
        return firstImage;
    }

    public void setFirstImage(String firstImage)
    {
        this.firstImage = firstImage;
    }

}
