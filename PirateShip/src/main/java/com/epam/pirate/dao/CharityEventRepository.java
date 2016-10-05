package com.epam.pirate.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.CharityEvent;

public interface CharityEventRepository extends PagingAndSortingRepository<CharityEvent, Long> {


}
