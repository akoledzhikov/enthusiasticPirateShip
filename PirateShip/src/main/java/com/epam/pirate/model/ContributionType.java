package com.epam.pirate.model;


public enum ContributionType
{
    SELL("http://localhost:8080/pirate/resources/contribIcons/sell.png"), 
    PURCHASE("http://localhost:8080/pirate/resources/contribIcons/buy.png"),
    ONE_OFF_DONATION("http://localhost:8080/pirate/resources/contribIcons/donation.png"), 
    MONTHLY_DONATION("http://localhost:8080/pirate/resources/contribIcons/monthlyDonation.png"),
    EVENT("http://localhost:8080/pirate/resources/contribIcons/event.png");

    private String iconLocation;


    private ContributionType(String iconLocation)
    {
        this.iconLocation = iconLocation;
    }


    public String getIconLocation()
    {
        return iconLocation;
    }

}
