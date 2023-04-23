
package com.nhnenter.repository;

import com.nhnenter.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Person, Integer> {


    List<Person> findByAge(int age);
}
