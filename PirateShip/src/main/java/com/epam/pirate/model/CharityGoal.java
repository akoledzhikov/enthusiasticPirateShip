package com.epam.pirate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "CharityGoals")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class CharityGoal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch=FetchType.EAGER)
    private Charity charity;
    @Column(length=10000)
    private String description;

    private double currentAmountOfMoney;

    private double targetAmountOfMoney;


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public Charity getCharity()
    {
        return charity;
    }


    public void setCharity(Charity charity)
    {
        this.charity = charity;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public double getCurrentAmountOfMoney()
    {
        return currentAmountOfMoney;
    }


    public void setCurrentAmountOfMoney(double currentAmountOfMoney)
    {
        this.currentAmountOfMoney = currentAmountOfMoney;
    }


    public double getTargetAmountOfMoney()
    {
        return targetAmountOfMoney;
    }


    public void setTargetAmountOfMoney(double targetAmountOfMoney)
    {
        this.targetAmountOfMoney = targetAmountOfMoney;
    }
}
