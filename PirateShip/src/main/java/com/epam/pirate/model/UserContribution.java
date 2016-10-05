package com.epam.pirate.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "UserContributions")
@GeneratePojoBuilder(withSetterNamePattern="*")
public class UserContribution
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    private ContributionType type;
    @ManyToOne
    private Charity targetCharity;
    @ManyToOne
    private Offer offer;
    @ManyToOne
    private CharityEvent event;

    // in case of donations only!
    private double money;


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


    public ContributionType getType()
    {
        return type;
    }


    public void setType(ContributionType type)
    {
        this.type = type;
    }


    public Charity getTargetCharity()
    {
        return targetCharity;
    }


    public void setTargetCharity(Charity targetCharity)
    {
        this.targetCharity = targetCharity;
    }


    public Offer getOffer()
    {
        return offer;
    }


    public void setOffer(Offer offer)
    {
        this.offer = offer;
    }


    public CharityEvent getEvent()
    {
        return event;
    }


    public void setEvent(CharityEvent event)
    {
        this.event = event;
    }


    public double getMoney()
    {
        return money;
    }


    public void setMoney(double money)
    {
        this.money = money;
    }
}
