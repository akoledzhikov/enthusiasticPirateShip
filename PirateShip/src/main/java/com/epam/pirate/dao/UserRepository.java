package com.epam.pirate.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.epam.pirate.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	User findByMailAndPassword(String mail, String password);
}
