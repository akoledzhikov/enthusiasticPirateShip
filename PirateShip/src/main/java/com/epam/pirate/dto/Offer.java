package com.epam.pirate.dto;


import java.util.ArrayList;

import com.epam.pirate.model.Charity;


public class Offer
{
    private long id;

    private String title;

    private String category;
    private String description;

    private ArrayList<String> pictures = new ArrayList<>();

    private String firstImage;

    private double price;

    private TargetCharity charity;


    public Offer(com.epam.pirate.model.Offer offer)
    {
        id = offer.getId();
        title = offer.getTitle();
        category = offer.getCategory();
        description = offer.getDescription();
        pictures = offer.getPictures();
        price = offer.getPrice();
        setFirstImage(pictures.isEmpty() ? null : pictures.get(0));
        setCharity(new TargetCharity(offer.getTargetCharity()));
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


    public TargetCharity getCharity()
    {
        return charity;
    }


    public void setCharity(TargetCharity charity)
    {
        this.charity = charity;
    }

    public static final class TargetCharity
    {

        private long id;

        private String image;


        public TargetCharity()
        {

        }


        public TargetCharity(Charity charity)
        {
            this.id = charity.getId();
            this.image = charity.getProfilePicture();
        }


        public long getId()
        {
            return id;
        }


        public void setId(long id)
        {
            this.id = id;
        }


        public String getImage()
        {
            return image;
        }


        public void setImage(String image)
        {
            this.image = image;
        }

    }

}
