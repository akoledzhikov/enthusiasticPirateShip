package com.epam.pirate.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.UserReward;


public interface UserRewardRepository
    extends PagingAndSortingRepository<UserReward, Long>
{

}
