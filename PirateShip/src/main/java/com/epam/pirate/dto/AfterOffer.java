package com.epam.pirate.dto;


import com.epam.pirate.dto.Offer.TargetCharity;
import com.epam.pirate.dto.megajson.MegaJson;


public class AfterOffer
{
    private MegaJson newState;

    private String text;

    private TargetCharity charity;


    public MegaJson getNewState()
    {
        return newState;
    }


    public void setNewState(MegaJson newState)
    {
        this.newState = newState;
    }


    public String getText()
    {
        return text;
    }


    public void setText(String text)
    {
        this.text = text;
    }


    public TargetCharity getCharity()
    {
        return charity;
    }


    public void setCharity(TargetCharity charity)
    {
        this.charity = charity;
    }
}
