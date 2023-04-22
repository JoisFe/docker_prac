package com.nhnenter.joisfe.service;

import com.nhnenter.joisfe.entity.Person;

import java.util.List;

public interface TestService {


    List<Person> findPeople(int age);
}
