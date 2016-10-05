package com.epam.pirate.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.CharityPost;


public interface CharityPostRepository
    extends PagingAndSortingRepository<CharityPost, Long>
{

}
