package com.epam.pirate.dto;

public class CharityGoal
{
    private long id;

    private String description;

    private double currentAmountOfMoney;

    private double targetAmountOfMoney;

    public CharityGoal(com.epam.pirate.model.CharityGoal goal){
    	id = goal.getId();
    	description = goal.getDescription();
    	currentAmountOfMoney = goal.getCurrentAmountOfMoney();
    	targetAmountOfMoney = goal.getTargetAmountOfMoney();
    }
    
    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
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
