package com.bhes.people.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhes.people.app.entity.People;

public interface PeopleDao extends MongoRepository<People, String>{

	People findByAge(int age);

}
