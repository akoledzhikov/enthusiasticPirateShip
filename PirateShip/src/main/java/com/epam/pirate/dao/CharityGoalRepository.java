package com.epam.pirate.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.CharityGoal;


public interface CharityGoalRepository
    extends PagingAndSortingRepository<CharityGoal, Long>
{

}
