package com.epam.pirate.model;


public enum ContributionType
{
    SELL("http://192.168.1.146:8080/pirate/resources/contribIcons/sell.png"), 
    PURCHASE("http://192.168.1.146:8080/pirate/resources/contribIcons/buy.png"),
    ONE_OFF_DONATION("http://192.168.1.146:8080/pirate/resources/contribIcons/donation.png"), 
    MONTHLY_DONATION("http://192.168.1.146:8080/pirate/resources/contribIcons/monthlyDonation.png"),
    EVENT("http://192.168.1.146:8080/pirate/resources/contribIcons/event.png");

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
