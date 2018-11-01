package com.bhes.people.app.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="People")
public class People {
	@Id
	private ObjectId _id;
	private String name;
	private int age;
	public People() {
		
	}
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public  ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [id=" + _id + ", name=" + name + ", age=" + age + "]";
	}	

}
