package com.epam.pirate.dto;

import java.util.ArrayList;
import java.util.List;

import com.epam.pirate.model.User;

public class Profile {
	
    private String mail;
    public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public List<Charity> getFavouriteCharities() {
		return favouriteCharities;
	}

	public void setFavouriteCharities(List<Charity> favouriteCharities) {
		this.favouriteCharities = favouriteCharities;
	}

	public List<Offer> getMyOffers() {
		return offers;
	}

	public void setMyOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public List<UserContribution> getHistory() {
		return history;
	}

	public void setHistory(List<UserContribution> history) {
		this.history = history;
	}

	public List<UserReward> getMyRewards() {
		return rewards;
	}

	public void setMyRewards(List<UserReward> rewards) {
		this.rewards = rewards;
	}

	private String address;
    private String contactPhone;
    
    private List<Charity> favouriteCharities = new ArrayList<>();
    
    private List<Offer> offers = new ArrayList<>();

    private List<UserContribution> history = new ArrayList<>();

    private List<UserReward> rewards = new ArrayList<>();
    
    public Profile(User user){
    	mail = user.getMail();
    	address = user.getAddress();
    	contactPhone = user.getContactPhone();
    	
    	//offers
    	for (com.epam.pirate.model.Offer offer : user.getOffers()) {
			offers.add(new Offer(offer));
		}
    	
    	//contributions
    	for (com.epam.pirate.model.UserContribution userContribution : user.getContributions()) {
    	    history.add(new UserContribution(userContribution));
		}
    	
    	//rewards
    	for (com.epam.pirate.model.UserReward userReward : user.getRewards()) {
			rewards.add(new UserReward(userReward));
		}
    	
    	//favouriteCharities
    	for (com.epam.pirate.model.Charity charity : user.getFavouriteCharities()) {
			favouriteCharities.add(new Charity(charity));
		}
    	
    }
}
