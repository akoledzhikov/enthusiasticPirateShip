package com.epam.pirate.dto;


public class CharityGoal
{
    private long id;

    private String description;

    private double currentAmountOfMoney;

    private double targetAmountOfMoney;

    private double percentage;


    public CharityGoal(com.epam.pirate.model.CharityGoal goal)
    {
        id = goal.getId();
        description = goal.getDescription();
        currentAmountOfMoney = goal.getCurrentAmountOfMoney();
        targetAmountOfMoney = goal.getTargetAmountOfMoney();
        percentage = currentAmountOfMoney / targetAmountOfMoney;
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
        return description;
    }


    public void setTitle(String description)
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


    public double getPercentage()
    {
        return percentage;
    }


    public void setPercentage(double percentage)
    {
        this.percentage = percentage;
    }
}
