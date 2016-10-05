package com.epam.pirate.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.UserContribution;


public interface UserContributionRepository
    extends PagingAndSortingRepository<UserContribution, Long>
{

}
