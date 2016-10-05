package com.epam.pirate.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.Offer;

public interface OfferRepository
extends PagingAndSortingRepository<Offer, Long>
{

}
