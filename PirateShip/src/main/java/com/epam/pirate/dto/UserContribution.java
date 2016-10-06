package com.epam.pirate.dto;




public class UserContribution
{
    private long id;

    private String image;

    private String date;

    private double value;

    private String description;


    public UserContribution(com.epam.pirate.model.UserContribution contribution)
    {
        this.id = contribution.getId();
        this.image = contribution.getType().getIconLocation();
        this.date = DTOUtil.dateToPrettyString(contribution.getDate());
        this.value = contribution.getValue();
        this.description = contribution.getText();
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


    public void setImage(String picture)
    {
        this.image = picture;
    }


    public double getValue()
    {
        return value;
    }


    public void setValue(double value)
    {
        this.value = value;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String text)
    {
        this.description = text;
    }


    public String getDate()
    {
        return date;
    }


    public void setDate(String date)
    {
        this.date = date;
    }
}
