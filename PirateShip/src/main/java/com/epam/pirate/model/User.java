package com.epam.pirate.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "Users")
@GeneratePojoBuilder(withSetterNamePattern="*")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String mail;

    private String password;

    private String address;

    private String contactPhone;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Charity> favouriteCharities;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Offer> offers;

    @OneToMany(fetch = FetchType.EAGER)
    private List<UserContribution> contributions;

    @OneToMany(fetch = FetchType.EAGER)
    private List<UserReward> rewards;


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getMail()
    {
        return mail;
    }


    public void setMail(String mail)
    {
        this.mail = mail;
    }


    public String getPassword()
    {
        return password;
    }


    public void setPassword(String password)
    {
        this.password = password;
    }


    public String getAddress()
    {
        return address;
    }


    public void setAddress(String address)
    {
        this.address = address;
    }


    public String getContactPhone()
    {
        return contactPhone;
    }


    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }


    public List<Charity> getFavouriteCharities()
    {
        return favouriteCharities;
    }


    public void setFavouriteCharities(List<Charity> favouriteCharities)
    {
        this.favouriteCharities = favouriteCharities;
    }


    public List<Offer> getOffers()
    {
        return offers;
    }


    public void setOffers(List<Offer> offers)
    {
        this.offers = offers;
    }


    public List<UserContribution> getContributions()
    {
        return contributions;
    }


    public void setContributions(List<UserContribution> contributions)
    {
        this.contributions = contributions;
    }


    public List<UserReward> getRewards()
    {
        return rewards;
    }


    public void setRewards(List<UserReward> rewards)
    {
        this.rewards = rewards;
    }
}
