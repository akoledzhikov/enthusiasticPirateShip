package com.epam.pirate.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.Charity;

public interface CharityRepository extends PagingAndSortingRepository<Charity, Long> {

}
