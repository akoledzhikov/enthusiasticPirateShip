package com.epam.pirate.dto.megajson;


import java.util.List;

import com.epam.pirate.dto.Charity;
import com.epam.pirate.dto.CharityEvent;
import com.epam.pirate.dto.Offer;
import com.epam.pirate.dto.Profile;


public class MegaJson
{
    private Profile myInfo;

    private List<Charity> charities;

    private List<Offer> offers;

    private List<CharityEvent> events;


    public Profile getMyInfo()
    {
        return myInfo;
    }


    public void setMyInfo(Profile myInfo)
    {
        this.myInfo = myInfo;
    }


    public List<Charity> getCharities()
    {
        return charities;
    }


    public void setCharities(List<Charity> charities)
    {
        this.charities = charities;
    }


    public List<Offer> getOffers()
    {
        return offers;
    }


    public void setOffers(List<Offer> offers)
    {
        this.offers = offers;
    }


    public List<CharityEvent> getEvents()
    {
        return events;
    }


    public void setEvents(List<CharityEvent> events)
    {
        this.events = events;
    }

}
