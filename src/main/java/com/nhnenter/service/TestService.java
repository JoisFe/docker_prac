package com.nhnenter.service;

import com.nhnenter.entity.Person;

import java.util.List;

public interface TestService {


    List<Person> findPeople(int age);
}
