package com.bhes.people.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhes.people.app.dao.PeopleDao;
import com.bhes.people.app.entity.People;

@Service
public class PeopleService {
	@Autowired
	private PeopleDao peopleDao;

	public People findByAge(int age) {
		// TODO Auto-generated method stub
		return peopleDao.findByAge(age);
	}

	public void saveAll(People people) {
		// TODO Auto-generated method stub
		peopleDao.save(people);
		
	}
}
