package com.bhes.people.app.controller;

import javax.validation.valueextraction.UnwrapByDefault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhes.people.app.entity.People;
import com.bhes.people.app.service.PeopleService;

@RestController
@RequestMapping(value ="/peoples")
public class PeopleController {
	
	@Autowired
	private PeopleService  peopleService;
	
	@GetMapping(value="/{age}")
	public People getPeopleByAge(@PathVariable(name = "age") int age)
	{
		People p=peopleService.findByAge(age);
		System.out.println(p);
		return p;
	}
	//@PutMapping(value="/people")
	//public void savePeople(People people)
	{
	//	peopleService.saveAll(people);
	}

}
