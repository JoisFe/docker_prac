package com.nhnenter.joisfe.service.impl;

import com.nhnenter.joisfe.entity.Person;
import com.nhnenter.joisfe.repository.TestRepository;
import com.nhnenter.joisfe.service.TestService;
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
