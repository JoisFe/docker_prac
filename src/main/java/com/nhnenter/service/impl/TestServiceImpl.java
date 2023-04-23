package com.nhnenter.service.impl;

import com.nhnenter.entity.Person;
import com.nhnenter.repository.TestRepository;
import com.nhnenter.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;
    @Override
    public List<Person> findPeople(int age) {
        return testRepository.findByAge(age);
    }
}
